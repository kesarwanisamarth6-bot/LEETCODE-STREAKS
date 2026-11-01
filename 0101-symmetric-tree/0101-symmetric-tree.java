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
       public boolean checkifSymmetric(TreeNode L, TreeNode R) {
        if(L==null && R==null){
            return true;
        }
        else if(L==null && R!=null){
            return false;
        }
        else if(L!=null && R==null){
            return false;
        }

        else if(L.val==R.val){
            boolean goLeft = checkifSymmetric(L.left,R.right);
            boolean goRight = checkifSymmetric(L.right,R.left);

            if(goLeft && goRight){
                return true;
            }
        }
        return false;


    }
    public boolean isSymmetric(TreeNode root) {
        return checkifSymmetric(root.left,root.right);
    }
} 