class Solution {
    public int countSeniors(String[] details) {

         int c=0;   
        for(int i=0;i<details.length;i++ ){
          
            int num = Integer.parseInt(details[i].substring(11, 13));
            if(num>60){
                c++;
            }

        }
        return c;
        
    }
}