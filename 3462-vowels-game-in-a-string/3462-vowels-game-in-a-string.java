class Solution {
    public boolean doesAliceWin(String s) {
        int c=0;
        String str="aeiou";
        for(int i=0;i<s.length();i++){
            if(str.indexOf(s.charAt(i))!=-1){
                c++;
            }
        }

        return c==0?false:true;
    }
}