class Solution {

    public static int num(char c){
        if(c=='I'){
        return 1;
        }

          else if(c=='V'){
        return 5;
        }
            else if(c=='X'){
        return 10;
        }
            else if(c=='L'){
        return 50;
        }
        else if(c=='C'){
        return 100;
        }
        else if(c=='D'){
        return 500;
        }
      
        return 1000;

    }





    public int romanToInt(String s) {
        int sum=0;
        int i=0;
         while(i<s.length()-1){
            if(num(s.charAt(i))<num(s.charAt(i+1))){
                sum -=num(s.charAt(i));
            }else{
                sum +=num((s.charAt(i)));
            }
            i++;
            
         }
           sum +=num((s.charAt(s.length()-1)));
        

        return sum;
    }
}