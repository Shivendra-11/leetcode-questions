class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[]=new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i]=points[i][0];
            
        }
        Arrays.sort(arr);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            maxi=Math.max(maxi,arr[i+1]-arr[i]);
        }
        return maxi;
    }
}