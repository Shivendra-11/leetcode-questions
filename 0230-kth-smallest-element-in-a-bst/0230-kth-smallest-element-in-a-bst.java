class Solution {
    public static void sma(TreeNode root,int prev[],int []k){
        if(root==null) return;

        sma(root.left,prev,k);
        k[0]--;
        if(k[0]>=0)
        prev[0]=root.val;
        if(k[0]<=0){
            return;
        }
        
        sma(root.right,prev,k);

    }
    public int kthSmallest(TreeNode root, int k) {
        int prev[]=new int[1];
        int ka[]=new int[1];
        ka[0]=k;
        sma(root,prev,ka);
        return prev[0];
    }
}