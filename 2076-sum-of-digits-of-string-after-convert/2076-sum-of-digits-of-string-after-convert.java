class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
  
       
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            str.append(num);
        }

        String rep = str.toString();

        
        for (int j = 0; j < k; j++) {
            int sum = 0;
           
            for (int l = 0; l < rep.length(); l++) {
                sum += rep.charAt(l) - '0';  
            }
            
            rep = String.valueOf(sum);
        }

        
        return Integer.parseInt(rep);
    }
}
