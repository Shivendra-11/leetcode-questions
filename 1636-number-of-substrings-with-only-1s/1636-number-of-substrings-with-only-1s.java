class Solution {
    public int numSub(String s) {
        int res=0;
        int c=0;
        int MOD=1000000007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }else{
                c=0;
            }
            res=(res+c)%MOD;
        }
return res;

    }
}