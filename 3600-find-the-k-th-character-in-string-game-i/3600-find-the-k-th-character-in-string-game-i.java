class Solution {
    public static void gen(StringBuilder s,int k){
        if(s.length()>=k){
            return ;
        }
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=(char)('a'+(s.charAt(i)-'a'+1)%26);
            s.append(ch);
        }
         gen(s,k);
    }
    public char kthCharacter(int k) {

        StringBuilder s=new StringBuilder("a");
        gen(s,k);
        return s.charAt(k-1);
    }
}