class Solution {
   public static int  binary(int s,int e,int target,int nums[]){
        if(s>e){
            return -1;
        }
         int mid=(s+e)/2;

         if(nums[mid]==target){
            return mid;
         }
         else if(nums[mid]>target){
            return binary(s,mid-1,target,nums);
         }
         return binary(mid+1,e,target,nums);

        
    }
    public int search(int[] nums, int target) {
       
        
        return   binary(0,nums.length-1,target,nums);
        
    }
}