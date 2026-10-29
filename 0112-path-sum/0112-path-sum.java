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
    public  boolean check(TreeNode root, int target,int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        boolean l = check(root.left, target,sum);
        boolean r = check(root.right ,target,sum);

        if(root.left ==null && root.right ==null){
            if(sum!=target){
                return false;
            }
            else{
                return true;
            }
        }
        return l||r;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
       return check(root,targetSum,sum);
    }
}