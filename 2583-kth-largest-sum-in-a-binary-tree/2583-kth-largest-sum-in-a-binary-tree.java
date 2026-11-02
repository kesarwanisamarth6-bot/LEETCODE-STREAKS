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
      public  void zigZagLevelorder(TreeNode root,ArrayList<Long> list ) {                   
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        long sum = 0L;
        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();
            if (currNode == null) {
                list.add(sum);
                sum = 0;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
            sum = sum + (long)currNode.val;
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> list = new ArrayList<>();
        zigZagLevelorder(root,list);
        Collections.sort(list);
        if(k<=list.size()){
        return  list.get(list.size()-k);
        }
        return -1;
    }
}