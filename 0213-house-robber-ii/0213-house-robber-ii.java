class Solution {
    public int find(int nums[],int i,int dp[]){
        if(i>=nums.length){
            return 0; 
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.max(nums[i]+find(nums,i+2,dp),find(nums,i+1,dp));
    }
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int arr1[]=new int[nums.length-1];
        int arr2[]=new int[nums.length-1];
        int dp1[]=new int[101];
        Arrays.fill(dp1,-1);
        int dp2[]=new int[101];
        Arrays.fill(dp2,-1);
        int maxi=0;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=nums[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=nums[i+1];
        }
        maxi=Math.max(find(arr1,0,dp1) ,find(arr2,0,dp2));
        return maxi;
    }
  
}