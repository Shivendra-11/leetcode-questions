class Solution {
    public int[] searchRange(int[] nums, int target) {
int s=0;
int e=nums.length-1;
int first=-1;
int last=-1;

        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
            
        }

            int low=0;
            int high=nums.length-1;
                
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
int arr[]=new int[2];
arr[0]=first;
arr[1]=last;

        
        return arr;
    }
}