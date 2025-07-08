class Solution {
    public static void inorder(TreeNode root,ArrayList<Integer>list){
        if(root!=null){
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>li1=new ArrayList<>();
        ArrayList<Integer>li2=new ArrayList<>();
        ArrayList<Integer>li=new ArrayList<>();
        inorder(root1,li1);
        inorder(root2,li2);

        for(int i=0;i<li1.size();i++){
            li.add(li1.get(i));
        }
        for(int i=0;i<li2.size();i++){
            li.add(li2.get(i));
        }
        Collections.sort(li);
        return li;

    }
}