class Solution {
    public int findMin(int[] arr) {
   int start=0;
   int ans=arr[0];
   int end=arr.length-1;
   while(start<=end){
   int mid=start+(end-start)/2;
   if(arr[mid]>=arr[0]){
    
    start=mid+1;

   }
   else{
    ans=arr[mid];
    end=mid-1;

   }






   }
   return ans;
        
    }
}