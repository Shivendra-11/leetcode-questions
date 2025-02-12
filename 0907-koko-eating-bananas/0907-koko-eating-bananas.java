class Solution {
    public static boolean rat(int piles[],int mid,int h){
        int res=0;
        for(int i=0;i<piles.length;i++){
             res+=piles[i]/mid;
             if(piles[i]%mid!=0){
                res++;
             }
        }
        return res<=h;
    }
    public int minEatingSpeed(int[] piles, int k) {
        int maxi=-1;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
     int l=1;
     int h=maxi;
     while(l<h){
        int mid=l+(h-l)/2;
             if(rat(piles,mid,k)){
               h=mid;
             }else{
                l=mid+1;
             }
     }   
     return l;
    }
}