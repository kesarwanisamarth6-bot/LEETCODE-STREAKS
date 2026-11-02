/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 1;
        public void maxSum(TreeNode root){
        if (root == null) {
            return ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int level = 1;
        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();

            if (currNode == null) {
                     if(sum>max){
                    max = sum;
                    ans = level;
                }
                level++;
                sum = 0;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                sum+=currNode.val;
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        
    }
    public int maxLevelSum(TreeNode root) {
        ans = 1;
        maxSum(root);
        return ans;
    }
}