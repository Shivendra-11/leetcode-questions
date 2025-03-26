

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length;
        int size = m * n;
        int[] arr = new int[size];
        
        
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[index++] = grid[i][j];
            }
        }

  
        Arrays.sort(arr);
        int median = arr[size / 2];

        int operations = 0;

        
        for (int num : arr) {
            if (Math.abs(num - median) % x != 0) {
                return -1;  
            }
            operations += Math.abs(num - median) / x;
        }

        return operations;
    }
}
