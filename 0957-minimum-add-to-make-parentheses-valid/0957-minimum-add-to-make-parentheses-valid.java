class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        // int c=0;
        for(int i=0;i<s.length();i++){
         
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }else if(st.peek()=='(' && s.charAt(i)==')'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}