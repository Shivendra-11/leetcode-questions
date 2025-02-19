class Solution {
    public static boolean finds(int dist[],double hour,int mid){
        double total=0.0;
        for(int i=0;i<dist.length-1;i++){
            total+=Math.ceil((double)dist[i]/(double)mid);
        }
        total+= (double) dist[dist.length-1]/(double)mid;
        return total<=hour;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int max=0;
        for(int i=0;i<dist.length;i++){
            if(dist[i]>max){
                max=dist[i];
            }
        }
        int l=1;
        int h=10000000;
           int res=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(finds(dist,hour,mid)){
                res=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}