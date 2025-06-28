class Solution {
    public static int findpos(int inorder[],int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static TreeNode buildfu(int inorder[],int postorder[],int start,int end,int idx){
        if(start>end) return null;
        TreeNode temp=new TreeNode(postorder[idx]);
        int pos=findpos(inorder,start,end,postorder[idx]);

        temp.right=buildfu(inorder,postorder,pos+1,end,idx-1);
        temp.left=buildfu(inorder,postorder,start,pos-1,idx-(end-pos)-1);

        return temp;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
     return buildfu(inorder,postorder,0,inorder.length-1,inorder.length-1);   

    }
}