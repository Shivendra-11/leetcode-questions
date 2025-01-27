class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long total=0;
        int i=0;
        
        while(i<n){

            long c=0;
            if(nums[i]==0){
                while(i<n && nums[i]==0){
                    c++;
                    total+=c;
                    i++;
                }
            }else{
                i++;
            }
        }
        return total;
    }
}