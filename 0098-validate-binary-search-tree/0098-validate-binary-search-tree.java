class Solution {
    public static void inorder(TreeNode root,ArrayList<Integer>li){
        if(root!=null){
            inorder(root.left,li);
            li.add(root.val);
            inorder(root.right,li);
        } 
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>li=new ArrayList<>();
        inorder(root,li);
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i)>=li.get(i+1)){
                return false;
            }
        }
return true;
    }
}