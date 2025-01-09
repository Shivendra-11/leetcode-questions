class Solution {
    public static boolean isprefix(String s,String t){
        int n=s.length();
        int m=t.length();
        if(n>m) return false;
        return (t.substring(0,n)).equals(s);
    }
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(isprefix(pref,words[i])){
                c++;
            }
        }
        return c;
    }
}