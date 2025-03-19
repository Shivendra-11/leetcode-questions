class Solution {
    public int minOperations(int[] nums) {
int c=0;
        for(int i=0;i<=nums.length-3;i++){
          if(nums[i]==0){
            int j=0;
            c++;
            while(j<3){
                if(nums[j+i]==0){
                    nums[j+i]=1;
                }else{
                    nums[j+i]=0;
                }
                j++;
            }
          }
        }
        int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       }
         if( sum==nums.length){
                return c;
         }
         return -1;
    }
}