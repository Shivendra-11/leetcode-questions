class Solution {
    public int smallestNumber(int n, int t) {
     int k=0;
        for(int i=n;i<n+11;i++){
          int mul=1;
          int p=i;
          int q=i;
          while(q>0){
            int rem=q%10;
            mul=mul*rem;
            q/=10;
          }
          if(mul%t==0){
            k=p;
            break;
          }
        }
        return k;
    }
}