class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int s=0;
        int e=arr.length-1;
        int first=-1;
        int second=-1;
        int arr1[]=new int[2];

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]==target){
                first= mid;
                e=mid-1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }

        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                second= mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
          for(int i=0;i<arr1.length;i++){
            arr1[0]=first;
            arr1[1]=second;
          }
return arr1;
    }
}