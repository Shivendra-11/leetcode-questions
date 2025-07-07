class Solution {
    public static TreeNode lca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;

        if(root.val>p.val && root.val>q.val){
            return lca(root.left,p,q);
        }
        else if(root.val<p.val && root.val<q.val){
            return lca(root.right,p,q);
        }

        return root;
    } 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
    }
}