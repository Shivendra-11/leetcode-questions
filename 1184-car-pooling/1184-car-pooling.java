class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int largestdis=-1;
        for(int trip[]:trips){
            largestdis=Math.max(largestdis,trip[2]);
        }
        int highway[]=new int [largestdis+1];

        for(int trip[]:trips){
            highway[trip[1]]+=trip[0];
            highway[trip[2]]-=trip[0];

        }
        for(int i=1;i<=largestdis;i++){
            highway[i]+=highway[i-1];
            if(highway[i-1]>capacity){
                return false;
            }
        }
        return true;
    }
}