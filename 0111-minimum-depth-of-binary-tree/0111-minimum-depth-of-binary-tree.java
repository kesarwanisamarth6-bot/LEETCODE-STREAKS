class Solution {
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return depth(root.right) + 1;
        }

        if (root.right == null) {
            return depth(root.left) + 1;
        }

        int lh = depth(root.left);
        int rh = depth(root.right);

        return Math.min(lh, rh) + 1;
    }

    public int minDepth(TreeNode root) {
        return depth(root);
    }
}