class Solution {
    public int findKthPositive(int[] arr, int k) {
        

        int l=0;
        int e=arr.length-1;
        int ans=arr.length;
        while(l<=e){
            int mid=l+(e-l)/2;
            if(arr[mid]-mid-1>=k){
                ans=mid;
                e=mid-1;
            }
            else{
               l=mid+1;
            }
        }
        return ans+k;
    }
}