class Solution {
    
    public int longestPalindrome(String s) {
        char[] sa = s.toCharArray();
        int[] counts = new int[150];
        for(char c:sa){
            counts[c]++;
        }
        boolean hasOdd=false;
        int ans=0;
        for(int i:counts){
            if(i%2==0){
                ans+=i;
            }else{
                hasOdd=true;
                if(i>2){
                    ans+=i-1;
                }
            }
        }
        if(hasOdd){
            ans++;
        }
        return ans;
    }
}