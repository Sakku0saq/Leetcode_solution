
import java.util.*;

class Solution {

    class WindowCost {

        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        long sumLeft = 0;
        long sumRight = 0;

        int sizeLeft = 0;
        int sizeRight = 0;

        void add(int num) {

            if (left.isEmpty() || num <= left.lastKey()) {
                left.merge(num, 1, Integer::sum);
                sumLeft += num;
                sizeLeft++;
            } else {
                right.merge(num, 1, Integer::sum);
                sumRight += num;
                sizeRight++;
            }

            balance();
        }

        void remove(int num) {

            if (left.containsKey(num)) {
                removeFrom(left, num);
                sumLeft -= num;
                sizeLeft--;
            } else {
                removeFrom(right, num);
                sumRight -= num;
                sizeRight--;
            }

            balance();
        }

        void removeFrom(TreeMap<Integer, Integer> map, int num) {
            int count = map.get(num);

            if (count == 1) {
                map.remove(num);
            } else {
                map.put(num, count - 1);
            }
        }

        void balance() {

            while (sizeLeft > sizeRight + 1) {
                int val = left.lastKey();

                removeFrom(left, val);
                sumLeft -= val;
                sizeLeft--;

                right.merge(val, 1, Integer::sum);
                sumRight += val;
                sizeRight++;
            }

            while (sizeLeft < sizeRight) {
                int val = right.firstKey();

                removeFrom(right, val);
                sumRight -= val;
                sizeRight--;

                left.merge(val, 1, Integer::sum);
                sumLeft += val;
                sizeLeft++;
            }
        }

        long getCost() {

            long median = left.lastKey();

            return median * sizeLeft - sumLeft
                    + sumRight - median * sizeRight;
        }
    }

    public long minOperations(int[] nums, int x, int k) {

        int n = nums.length;

        long[] cost = new long[n - x + 1];

        WindowCost window = new WindowCost();

        // Calculate cost for every window of size x
        for (int i = 0; i < n; i++) {

            window.add(nums[i]);

            if (i >= x) {
                window.remove(nums[i - x]);
            }

            if (i >= x - 1) {
                cost[i - x + 1] = window.getCost();
            }
        }

        // DP
        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], INF);
        }

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= k; j++) {

                // Skip current element
                dp[i][j] = dp[i - 1][j];

                // Select window ending at i-1
                if (i >= x && dp[i - x][j - 1] != INF) {

                    dp[i][j] = Math.min(
                        dp[i][j],
                        dp[i - x][j - 1] + cost[i - x]
                    );
                }
            }
        }

        return dp[n][k];
    }
}
