class Solution {
    public int reverse(int x) {

        long rem=0;
        // int res=0;
        while(x!=0){
                 
            int mod=x%10;
            rem=rem*10+mod;
            x=x/10;

        }
        
        return (rem<Integer.MIN_VALUE || rem>Integer.MAX_VALUE )?0: (int) (rem);
        
    }
}