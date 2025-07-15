class Solution {
    public int longestSubarray(int[] nums) {
      int res=0;
      int lastzero=-1;
      int zeroc=0;
      int i=0;
      int j=0;
      int n=nums.length;
      while(j<n){
       if(nums[j]==0){
            i=lastzero+1;
            lastzero=j;
         
        }
        res=Math.max(res,j-i);
        j++;
      }
      return res;
    }
}