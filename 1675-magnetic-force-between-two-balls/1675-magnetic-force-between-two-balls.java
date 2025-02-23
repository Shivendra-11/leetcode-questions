class Solution {
    public static boolean finds(int arr[],int m,int mid){
        int prev=arr[0];
        int curr;
        int c=1;
        for(int i=1;i<arr.length;i++){
            curr=arr[i];
              if(curr-prev>=mid){
                c++;
                prev=curr;
              }
              if(c==m){
                break;
              }

        }
        return c==m;

    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int l=1;
        int h=position[n-1]-position[0];
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
             if(finds(position,m,mid)){
                ans=mid;
                l=mid+1;
             }else{
                h=mid-1;
             }
        }
        return ans;
    }
}