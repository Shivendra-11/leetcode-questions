class Solution {
    void merge(int arr[],int start,int mid,int end ){
        int temp[]=new int[end-start+1];
        int left=start;
        int right=mid+1;
        int index=0;
        while(left<=mid && right<=end){
             if(arr[left]<=arr[right]){
                temp[index++]=arr[left++];

             }else{
                temp[index++]=arr[right++];
             }

        }
        while(left<=mid){
          temp[index++]=arr[left++];
        }
        while(right<=end){
            temp[index++]=arr[right++];
        }
       for(int i=0;i<temp.length;i++){
        arr[start+i]=temp[i];
       }
    }

    void mergesort(int arr[],int start,int end){
        if(start>=end) return;
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    public int[] sortArray(int[] nums) {
       mergesort(nums,0,nums.length-1);
       return nums;
        
    }
}