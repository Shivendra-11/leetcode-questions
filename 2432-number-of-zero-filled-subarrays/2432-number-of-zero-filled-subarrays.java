class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
      
        int i=0;
        long res=0;
        while(i<n){
              long len=0;

               if( nums[i]==0){
                while(i<n && nums[i]==0){
                i++;
                len++;
                }
               }else{
                i++;
               }
            res+=len*(len+1)/2;

        }
        return res;
    }
}