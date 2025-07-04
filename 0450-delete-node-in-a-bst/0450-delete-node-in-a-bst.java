
class Solution {
    public TreeNode deleteNode(TreeNode root, int x) {
         if(root==null) return null;
       
       if(root.val>x){
           root.left=deleteNode(root.left,x);
           return root;
       }
       
        else if(root.val<x){
           root.right=deleteNode(root.right,x);
           return root;
       }
       
       else{
           
        //   leaf node hua to
        
        if(root.left==null && root.right==null){
            return null;
        }
        // if only one child
        else if(root.left==null){
            return root.right;
        }
        else if(root.right==null  ){
            return root.left;
        }
        
        // if both the child exist
        else{
            TreeNode child=root.left;
            TreeNode parent=root;
            
            while(child.right!=null){
                parent=child;
                child=child.right;
            }
            
            if(root!=parent){
               parent.right=child.left;
               child.left=root.left;
               child.right=root.right;
               return child;
                
            }else{
                child.right=root.right;
                return child;
            }
            
        }
        
        
       }
       
    }
}