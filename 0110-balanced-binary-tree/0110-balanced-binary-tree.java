
class Solution {
     public static int heightfun(TreeNode root,boolean []valid){
        if(root==null) return 0;
        int l=heightfun(root.left,valid);
        int r=heightfun(root.right,valid);

        if(Math.abs(l-r)>1){
            valid[0]=false;
        }
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        boolean valid[]=new boolean[1];
        valid[0]=true;
        heightfun(root,valid);
        return valid[0];
    }
}