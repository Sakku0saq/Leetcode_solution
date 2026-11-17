
class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int INF = 1000000;

        // cost[i][j] = minimum changes to make s[i...j]
        // a semi-palindrome
        int[][] cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                cost[i][j] = INF;

                int len = j - i + 1;

                // A semi-palindrome needs length >= 2
                if (len < 2) continue;

                // Try every proper divisor
                for (int d = 1; d < len; d++) {

                    if (len % d != 0) continue;

                    int changes = 0;

                    // Check each group
                    for (int r = 0; r < d; r++) {

                        int left = r;
                        int right = len - d + r;

                        // Compare mirrored characters
                        while (left < right) {

                            if (s.charAt(i + left) !=
                                s.charAt(i + right)) {
                                changes++;
                            }

                            left += d;
                            right -= d;
                        }
                    }

                    cost[i][j] = Math.min(
                        cost[i][j], changes
                    );
                }
            }
        }

        // DP
        // dp[i][j] = minimum changes to partition
        // first i characters into j substrings
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = INF;
            }
        }

        dp[0][0] = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k; j++) {

                // Last substring starts at p
                for (int p = 0; p <= i - 2; p++) {

                    if (dp[p][j - 1] == INF) {
                        continue;
                    }

                    dp[i][j] = Math.min(
                        dp[i][j],
                        dp[p][j - 1] + cost[p][i - 1]
                    );
                }
            }
        }

        return dp[n][k];
    }
}
