
class Solution {
    public static void helper(TreeNode root,List<String>li,String s){
        if(root==null)return;
        if(root.left==null&&root.right==null){
            s+=root.val;
            li.add(s);
            return;
        }
        helper(root.left,li,s+root.val+"->");
        helper(root.right,li,s+root.val+"->");

    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String>li=new ArrayList<>();
        helper(root,li,"");
        return li;

    }
}