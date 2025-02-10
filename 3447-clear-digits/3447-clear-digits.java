class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
       
        for (int i = 0; i < s.length(); i++) {
           char k=s.charAt(i);
           if(Character.isDigit(k) && !st.empty()  ){
            st.pop();
           }else{
            st.push(k);
           }
        }
        StringBuilder str = new StringBuilder();

        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}