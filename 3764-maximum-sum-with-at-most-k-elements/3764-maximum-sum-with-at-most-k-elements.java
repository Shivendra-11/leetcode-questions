class Solution {
    public long maxSum(int[][] grid, int[] limit, int k) {
        int n = grid.length;
        PriorityQueue<Integer> ans= new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> row;
        int m = grid[0].length;
        int p=0;
        int arr[] = new int[m * n];
        for (int i = 0; i < n; i++) {
            row=new PriorityQueue<Integer>(Collections.reverseOrder());
            for (int j = 0; j < m; j++) {
               row.add(grid[i][j]);
            }
            while(limit[i]-- >0){
                ans.add(row.remove());

            }
            row.clear();
        }
        
        long c=0;
        for(int i=0;i<k;i++){
            c+=ans.poll();
        }
        return c;

    }
}