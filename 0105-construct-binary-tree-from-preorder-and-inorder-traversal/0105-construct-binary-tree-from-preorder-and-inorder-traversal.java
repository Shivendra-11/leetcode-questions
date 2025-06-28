class Solution {
    public static int findpos(int inorder[],int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static TreeNode buildfu(int inorder[],int preorder[],int start,int end,int idx){
        if(start>end) return null;
        TreeNode temp=new TreeNode(preorder[idx]);
        int pos=findpos(inorder,start,end,preorder[idx]);

        temp.left=buildfu(inorder,preorder,start,pos-1,idx+1);
        temp.right=buildfu(inorder,preorder,pos+1,end,idx+(pos-start)+1);

        return temp;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildfu(inorder,preorder,0,inorder.length-1,0);
    }
}