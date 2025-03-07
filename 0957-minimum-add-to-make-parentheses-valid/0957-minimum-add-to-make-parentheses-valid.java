class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int minAdd = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
            }
            else if(c == ')'){
                if(open > 0){
                    open--;
                }
                else{
                    minAdd++;
                }
            }
        }

        if(open != 0){
            minAdd += open;
        }

        return minAdd;
    }
}