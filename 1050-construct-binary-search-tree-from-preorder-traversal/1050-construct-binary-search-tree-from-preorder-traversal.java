
class Solution {
    public static TreeNode bst(int arr[],int lower,int upper,int []i){
        if(i[0]==arr.length||arr[i[0]]<lower||arr[i[0]]>upper){
            return null;
        }
        TreeNode root=new TreeNode(arr[i[0]++]);
        root.left=bst(arr,lower,root.val,i);
        root.right=bst(arr,root.val,upper,i);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        
        int i[]=new int[1];
        int  lower=Integer.MIN_VALUE;
        int upper=Integer.MAX_VALUE;
        return bst(preorder,lower,upper,i);
    }
}