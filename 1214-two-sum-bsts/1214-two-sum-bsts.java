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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
         Set<Integer> set = new HashSet<>();
        addValuesToSet(root1,set);
        return hasSum(root2,set,target);
    }
    
    public void addValuesToSet(TreeNode node,Set<Integer> set){
        if(node==null)
            return;
        set.add(node.val);
        addValuesToSet(node.left,set);
        addValuesToSet(node.right,set);
    }
    
    public boolean hasSum(TreeNode node,Set<Integer> set,int target){
        if(node==null)
            return false;
        if(set.contains(target-node.val)){
            return true;
        }
        return hasSum(node.left,set,target) || hasSum(node.right,set,target);
    }
    
}