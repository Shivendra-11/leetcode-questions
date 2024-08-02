class Solution {
    public String firstPalindrome(String[] words) {

        for(int i=0;i<words.length;i++){
int p=0;
 boolean o=true;
int j=words[i].length()-1;
            while(p<=j){
               
                if(words[i].charAt(p)!=words[i].charAt(j)){
                  
                 
                   o=false;
                    break;

                }
                else{
                   p++;
                    j--;
                }

                
            }
            if(o){
                return words[i];
            }
           
              
          
          
            

        }
        return "";
        
    }
}