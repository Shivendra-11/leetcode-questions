class Solution {
    public String build(String s){
          Stack<Character>st1=new Stack<>();

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#' && !st1.isEmpty()){
            st1.pop();
        }else if(s.charAt(i)!='#'){
            st1.push(s.charAt(i));
        }
    }
    

     return String.valueOf(st1);

    }
    public boolean backspaceCompare(String S, String T) {
    
return build(S).equals(build(T)) ; 
    }
}