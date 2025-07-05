class Solution {
    public static void inorder(TreeNode root,ArrayList<Integer>li){
        if(root!=null){
            inorder(root.left,li);
            li.add(root.val);
            inorder(root.right,li);
        }
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer>li=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        inorder(root,li);
        for(int i=0;i<li.size()-1;i++){
            mini=Math.min(mini,li.get(i+1)-li.get(i));
        }
        return mini;
    }
}