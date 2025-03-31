class Solution {
    public long putMarbles(int[] weights, int k) {
        
        int arr[]=new int[weights.length-1];
        for(int i=0;i<weights.length-1;i++){
            arr[i]=weights[i]+weights[i+1];
        }
  Arrays.sort(arr);
        long right=0;
        long left=0;
        for(int i=0;i<k-1;i++){
            left+=arr[i];
            right+=arr[arr.length-i-1];
        }
  return right-left;

    }
}