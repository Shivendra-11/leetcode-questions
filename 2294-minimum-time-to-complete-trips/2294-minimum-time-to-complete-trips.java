class Solution {
    public static boolean triptime(int []time,long mid,int totaltrips){
        long res=0;
        for(int i=0;i<time.length;i++){
            res+=mid/time[i];
        }
        return res>=totaltrips;
    }
    public long minimumTime(int[] time, int totaltrips) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<time.length;i++){
          mini=Math.min(mini,time[i]);
        }
        long l=1;
        long h = 1L * mini * totaltrips;
        while(l<h){
            long mid=l+(h-l)/2;
            if(triptime(time,mid,totaltrips)){
         h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}