class Solution {
    public boolean rotateString(String s, String goal) {
        
 String str=s+s;

        for(int i=0;i<s.length();i++){
            if(str.contains(goal)&&s.length()==goal.length()){
                return true;
            }
    
        }
        return false;
    }

}