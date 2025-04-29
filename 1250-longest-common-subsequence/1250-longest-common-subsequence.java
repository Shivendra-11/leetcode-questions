class Solution {
    public static int find(String s1,String s2,int i,int j,int dp[][]){
        if(i>=s1.length()||j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
          return 1+find(s1,s2,i+1,j+1,dp);
        }
        return  dp[i][j]=Math.max(find(s1,s2,i+1,j,dp),find(s1,s2,i,j+1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[1001][1001];
        for(int i=0;i<1001;i++){
            for(int j=0;j<1001;j++){
                dp[i][j]=-1;
            }
        }
        return find(text1,text2,0,0,dp);
    }
}