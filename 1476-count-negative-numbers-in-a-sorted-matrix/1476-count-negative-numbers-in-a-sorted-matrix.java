class Solution {
    public int countNegatives(int[][] grid) {
        int r=grid.length-1;
        int c=0;
        int res=0;
        int n=grid[0].length;
        while(r>=0 && c<n){
            if(grid[r][c]>=0){
                c++;
            }else{
                res+=(n-c);
                r--;
            }
        }
        return res;
    }
}