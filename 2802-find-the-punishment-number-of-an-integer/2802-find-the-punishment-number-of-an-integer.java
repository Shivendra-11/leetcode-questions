class Solution {
    public static boolean isvalid(int sq,int sum,int n){
        // int int sq=n*n;
        if(sq==0){
            return sum==n;
        }
        
        return isvalid(sq/10,sum+sq%10,n) || isvalid(sq/100,sum+sq%100,n)||isvalid(sq/1000,sum+sq%1000,n)||isvalid(sq/10000,sum+sq%10000,n);
    }
    public int punishmentNumber(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
             int q=i*i;
             if(isvalid(q,0,i)){
               res+=q;
             }
        
        }
        return res;
    }
}