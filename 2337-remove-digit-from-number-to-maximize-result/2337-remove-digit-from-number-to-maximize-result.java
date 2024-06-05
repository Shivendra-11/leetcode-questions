class Solution {
    public String removeDigit(String number, char digit) {
        int n=number.length();
int index=0;
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit){
                index=i;
             if(i< n-1 && number.charAt(i+1)>digit ){
                // index=i;
                break;
            }
                 
            }

        }
 return number.substring(0,index) + number.substring(index+1); 
       
    }
}