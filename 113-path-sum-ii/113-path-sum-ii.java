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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> currNodes = new ArrayList<>();
        List<List<Integer>> allNodes = new ArrayList<List<Integer>>();
        
        pathSum(root,currNodes,allNodes,targetSum);
        return allNodes;
    }
    
    public void pathSum(TreeNode root,List<Integer> currNodes,List<List<Integer>> allNodes, int targetSum){
        
        if(root==null)
            return;
        
        currNodes.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val){
           allNodes.add(new ArrayList<>(currNodes));  
        } 
        pathSum(root.left,currNodes,allNodes,targetSum-root.val);
        pathSum(root.right,currNodes,allNodes,targetSum-root.val);
        currNodes.remove(currNodes.size()-1);
        
    }
}