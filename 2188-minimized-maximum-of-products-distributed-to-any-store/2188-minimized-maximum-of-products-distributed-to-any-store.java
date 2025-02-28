class Solution {
    public static boolean finds(int quantities[],int n,int mid){
        int c=0;
        for(int i=0;i<quantities.length;i++){
              c+=Math.ceil((quantities[i]+ mid-1)/mid);
        }
        return c<=n;
    }
    public int minimizedMaximum(int n, int[] quantities) {
       
        int maxi=-1;
        for(int i=0;i<quantities.length;i++){
            if(maxi<quantities[i]){
                maxi=quantities[i];
            }
        }
        int l=1;
        int h=maxi;
        int res=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(finds(quantities,n,mid)){
                res=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}