class Solution {
    public int minimumOperations(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        // if()
        int count = 0;
        for (int i = 0; i <= c - 1; i++) {
            for (int j = 1; j <= r - 1; j++) {
                if (grid[j-1][i] >= grid[j][i]) {
                    count += grid[j-1][i] - grid[j][i] + 1;
                    grid[j][i] = grid[j-1][i] + 1;
                }
            }
        }
        return count;
    }
}