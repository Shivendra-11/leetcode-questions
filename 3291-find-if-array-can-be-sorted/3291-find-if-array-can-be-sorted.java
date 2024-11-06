class Solution {
    public boolean canSortArray(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                int set1=Integer.bitCount(nums[j-1]);
                int set2=Integer.bitCount(nums[j]);
                if(set1==set2 && nums[j-1]>nums[j] ){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
            
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }

}