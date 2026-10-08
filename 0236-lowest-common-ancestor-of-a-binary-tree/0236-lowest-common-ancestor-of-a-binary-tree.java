/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static TreeNode lca(TreeNode root,int p,int q){
       if(root==null || root.val == p || root.val ==q){
        return root;
       }

       TreeNode leftLca = lca(root.left,p,q);
       TreeNode rightLca = lca(root.right,p,q);
       if(leftLca==null){
        return rightLca;
       }
        
        if(rightLca==null){
            return leftLca;
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int pval = p.val;
        int qval = q.val;
        return lca(root,pval,qval);
    }
}