
class Solution {
    int m, n;

    long dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= m || j >= n
                || grid[i][j] == 0) {
            return 0;
        }

        // Store value and mark as visited
        int value = grid[i][j];
        grid[i][j] = 0;

        long sum = value;

        sum += dfs(i + 1, j, grid);
        sum += dfs(i - 1, j, grid);
        sum += dfs(i, j + 1, grid);
        sum += dfs(i, j - 1, grid);

        return sum;
    }

    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = dfs(i, j, grid);

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
