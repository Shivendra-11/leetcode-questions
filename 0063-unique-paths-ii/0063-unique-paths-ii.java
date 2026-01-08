class Solution {
    public static int solve(int grid[][],int i,int j,int dp[][]){
        if(i>=grid.length||j>=grid[0].length||i<0||j<0||grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        return dp[i][j]=(solve(grid,i+1,j,dp)+solve(grid,i,j+1,dp));

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[101][101];
        for(int i=0;i<101;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(obstacleGrid,0,0,dp);
    }
}