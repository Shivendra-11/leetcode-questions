class Solution {
    public int find(int pairs[][],int i,int prev,int dp[][]){
        if(i>=pairs.length){
            return 0;
        }

        if(prev!=-1 && dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int take=0;
        if(prev==-1 || pairs[prev][1]<pairs[i][0]){
            take=1+find(pairs,i+1,i,dp);
        }
        int skip=find(pairs,i+1,prev,dp);
       
        return dp[i][prev+1]=Math.max(take,skip);
    }
    public int findLongestChain(int[][] pairs) {
       Arrays.sort(pairs, (a, b) -> Double.compare(a[0], b[0]));
       int dp[][]=new int[1001][1001];
       for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp.length;j++){
            dp[i][j]=-1;
        }
       }
       return find(pairs,0,-1,dp);
    }
}