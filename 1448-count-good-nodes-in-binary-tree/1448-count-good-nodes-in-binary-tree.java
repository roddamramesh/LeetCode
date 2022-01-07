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
    public int goodNodes(TreeNode root) {
        return goodNodes(root,root.val);
    }
    
     public int goodNodes(TreeNode node, int maxValueSoFar) {
         int noOfGoodNodes=0;
         if(node!=null){
             if(node.val>=maxValueSoFar){
                 maxValueSoFar= node.val;
                 noOfGoodNodes++;
             }
             noOfGoodNodes +=goodNodes(node.left,maxValueSoFar);
             noOfGoodNodes +=goodNodes(node.right,maxValueSoFar);
         }
         return noOfGoodNodes;
    }
    
}