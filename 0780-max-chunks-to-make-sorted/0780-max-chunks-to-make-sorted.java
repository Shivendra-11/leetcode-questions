class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxi=0;
        int chunks=0;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            if(i==maxi){
                chunks++;
            }
        }
        return chunks;
    }
}