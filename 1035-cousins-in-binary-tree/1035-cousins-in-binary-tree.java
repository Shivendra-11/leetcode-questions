class Solution {
    public boolean parentcheck(TreeNode root, int x, int y) {
        if (root == null) return false;

        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) ||
                (root.left.val == y && root.right.val == x)) {
                return true;
            }
        }

        return parentcheck(root.left, x, y) || parentcheck(root.right, x, y);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int l1 = -1, l2 = -1;
        int level = 0;

        while (!q.isEmpty()) {
            int n = q.size();

            while (n-- > 0) {
                TreeNode temp = q.poll();

                if (temp.val == x) l1 = level;
                if (temp.val == y) l2 = level;

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }

            if (l1 != -1 && l2 != -1) break;
            if ((l1 != -1 && l2 == -1) || (l2 != -1 && l1 == -1)) return false;

            level++;
        }

        if (l1 == -1 || l2 == -1) return false;
        return l1 == l2 && !parentcheck(root, x, y);
    }
}
