class Solution {
    static void Swap(int nums[] , int i , int j ){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void sortColors(int[] nums) {
        int i , j,small;

        for( i=0;i<nums.length-1;i++){
            small=i;
            for( j=i;j<nums.length;j++){
                if(nums[j]<nums[small]){
                    small=j;
                }
            }
            Swap(nums,i,small);
        }

           
       
    }
}