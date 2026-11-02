
class Solution {

    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int max = Integer.MIN_VALUE;
        int ans = 1;
        int level = 1;

        while (!q.isEmpty()) {

            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode currNode = q.remove();

                sum += currNode.val;

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }

            if (sum > max) {
                max = sum;
                ans = level;
            }

            level++;
        }

        return ans;
    }
}
