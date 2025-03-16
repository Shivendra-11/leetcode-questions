class Solution {
    public static boolean find(int arr[],int cars,long mid){
         long res=0;
        //  long c=0;
        for(int num:arr){
            long c=mid/num;
            long c2=(long)Math.sqrt(c);
            res+=c2;
        }
        return res>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long l=1;
        long maxi=Integer.MIN_VALUE;
        for(int i=0;i<ranks.length;i++){
            if(ranks[i]>maxi){
                maxi=ranks[i];
            }
        }
        long res=0;
        long r=maxi*cars*cars;
        while(l<=r){
            long mid=(l+r)/2;
            if(find(ranks,cars,mid)){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}