class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int rowa[] = new int[n];
        int cola[] = new int[m];
        int diff[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    rowa[i] += 1;
                    cola[j] += 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int oner=rowa[i];
                int onec=cola[j];
                int zeror=n-oner;
                int zeroc=m-onec;

                diff[i][j] = oner + onec - zeror - zeroc;
            }
        }
        return diff;
    }
}