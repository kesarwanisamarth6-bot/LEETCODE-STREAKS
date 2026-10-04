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

    public int height(TreeNode Rooot){
        if(Rooot==null){
            return 0;
        }
        int lh = height(Rooot.left);
        int rh = height(Rooot.right);
        
        return Math.max(lh,rh)+1;
    }

    public int diameter(TreeNode Root){
        if(Root==null){
            return 0;
        }
        int ld = diameter(Root.left);
        int lh = height(Root.left);
        int rd = diameter(Root.right);
        int rh = height(Root.right);

        int selfDia = lh+rh;
        return Math.max(selfDia,Math.max(ld,rd));
    }


    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
        
    }
}