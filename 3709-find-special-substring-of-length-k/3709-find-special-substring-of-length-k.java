class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
       HashSet<Integer> hs=new HashSet<>();
       int c=1;
       for(int i=1;i<s.length();i++){
          if(s.charAt(i-1)==s.charAt(i)){
            c++;
          }else{
            hs.add(c);
            c=1;
          }
       }
       hs.add(c);
       return hs.contains(k);
    }
}