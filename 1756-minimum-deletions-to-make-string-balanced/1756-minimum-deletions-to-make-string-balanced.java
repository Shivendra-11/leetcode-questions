class Solution {
    public int minimumDeletions(String s) {

        int res=0;
        int c=0;
        // char ch;
char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='b'){
                c++;
            }
            else if(c!=0){
                c--;
                res++;
            }
        }
return res;
        
        
    }
}