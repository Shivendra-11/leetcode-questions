class Solution {
    public int longestNiceSubarray(int[] nums) {
        int i=0;
        int j=0;
        int mask=0;
        int res=1;

        int n=nums.length;
        while(j<n){
          
          while((mask & nums[j])!=0){
            mask=(mask^nums[i]);
            i++;
          } 
          res=Math.max(res,j-i+1);
          mask =(mask|nums[j]);
           j++;
        }

        return res;
    }
}