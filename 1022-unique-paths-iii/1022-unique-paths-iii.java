class Solution {
    private static int res = 0;

    public static void find(int[][] grid, int count, int r, int c, int i) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
            return;
        }
        if (grid[r][c] == -1) {
            return;
        }
        if (grid[r][c] == 2) {
            if (i == count) {
                res++;
            }
             return;
        }

        grid[r][c] = -1;

        find(grid, count, r + 1, c, i + 1);
        find(grid, count, r - 1, c, i + 1);
        find(grid, count, r, c + 1, i + 1);
        find(grid, count, r, c - 1, i + 1);

        grid[r][c] = 0;

    }

    public int uniquePathsIII(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
                
            }
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    start = i;
                    end = j;
                }
            }

        }

        res = 0;
        find(grid, count + 1, start, end, 0);
        return res;

    }
}