class Solution {
    public static void genr(StringBuilder s ,int left,int right,int n,ArrayList<String>ans){
        if(left+right==2*n){
            ans.add(s.toString());
            return ;
        }
        if(left<n){
            s.append("(");
           genr(s,left+1,right,n,ans);
           s.setLength(s.length()-1);
        }
         if(right<left){
               s.append(")");
            genr(s,left,right+1,n,ans);
               s.setLength(s.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        genr(new StringBuilder(),0,0,n,ans);
        return ans;
    }
}