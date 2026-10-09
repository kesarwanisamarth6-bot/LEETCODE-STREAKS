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
    public TreeNode BuildTree(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }

        if(root.val> val){
            root.left = BuildTree(root.left,val);
        }
        else {
            root.right = BuildTree(root.right,val);
        }
        
        return root;

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return BuildTree(root,val);
    }
}