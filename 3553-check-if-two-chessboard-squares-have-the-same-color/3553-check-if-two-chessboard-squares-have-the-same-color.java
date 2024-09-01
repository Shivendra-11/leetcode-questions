class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int p=coordinate1.charAt(0)-'a';
        int q=coordinate2.charAt(1)-'1';
         int r=coordinate2.charAt(0)-'a';
        int s=coordinate1.charAt(1)-'1';
boolean black1=false;
boolean black2=false;

       if((p-r)%2==0){
         black1=true;
       }
            if((q-s)%2==0){
         black2=true;
       }
        
    
return black1==black2;

        
    }
}