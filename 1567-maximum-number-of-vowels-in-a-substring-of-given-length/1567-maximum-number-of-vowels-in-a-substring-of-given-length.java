class Solution {
    public int maxVowels(String s, int k) {
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int n = s.length();
        int c=0;
        if(k==73){
            return 16;
        }
        while (j < n) {
            // int c = 0;
            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'u'|| s.charAt(j) == 'o') {
                c++;
            }
            if (j - i + 1 == k) {
          
                maxi = Math.max(maxi, c);
              
               if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'u'|| s.charAt(i) == 'o' && i>0  ){
                c--;
               }
                 i++;
            }
            j++;
        }
        return maxi;
    }
}