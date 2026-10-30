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
    public void allPath(TreeNode root, int target, int sum,List<List<Integer>> ans,List<Integer> list){
        if(root==null){
            return;
        }
        sum+=root.val;
        list.add(root.val);
        if(root.left==null && root.right == null){
            if(sum!=target){
                if(!list.isEmpty()){
                list.remove(list.size()-1);
                return;
                }
            }
            else{
                ans.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }
        }
        allPath(root.left,target,sum,ans,list);
        allPath(root.right,target,sum,ans,list);
        list.remove(list.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    allPath(root,targetSum,0,ans,list);
    return ans;
    }
}