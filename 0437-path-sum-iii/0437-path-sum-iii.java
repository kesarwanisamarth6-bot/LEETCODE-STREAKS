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
    static int count=0;
    public void allPath(TreeNode root, int target, long sum){
        if(root==null){
            return;
        }
        sum+=root.val;
        if(sum==target){
            count++;
        }
        allPath(root.left,target,sum);
        allPath(root.right,target,sum);
    }

    public void allStart(TreeNode root, int target,long sum){
        if(root==null){
            return;
        }
        allPath(root,target,sum);
        allStart(root.left,target,sum);
        allStart(root.right,target,sum);
    }
    public int pathSum(TreeNode root, int targetSum) {
        count=0;
        allStart(root,targetSum,0);
        return count;
    }
}