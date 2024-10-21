class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int s=0;
        // int ans=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=e+(s-e)/2;
             
             if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
               return mid;
            
             }else if(arr[mid]<arr[mid-1]){
                e=mid-1;
             }else{
                s=mid+1;
             }
        }
        return -1;
    }
}