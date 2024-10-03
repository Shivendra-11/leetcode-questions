class Solution {
    public int trap(int[] heights) {

       int arr1[]=new int[heights.length];
       int arr2[]=new int[heights.length];
        arr1[0]=0;

       for(int i=1;i<heights.length;i++){
          arr1[i]=Math.max(arr1[i-1],heights[i-1]); 
       } 
       arr2[heights.length-1]=0;
       for(int i=heights.length-2;i>=0;i--){
        arr2[i]=Math.max(arr2[i+1],heights[i+1]);
       }
       int water=0;
       int minheight=0;
       for(int i=0;i<heights.length;i++){
        minheight=Math.min(arr1[i],arr2[i]);
        if(minheight-heights[i]>=0){
            water+=minheight-heights[i];
        }
       }
        return water;
    }
}