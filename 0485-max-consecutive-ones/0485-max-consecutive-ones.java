class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(max<c){
                    max=c;
                }
                c=0;
            }else{
            c++;
            }

        }
        if(max<c){
                    max=c;
                }

return max;
    }
}