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
    int tiltValue=0;
    public int findTilt(TreeNode root) {
         findTiltSum(root);
        return tiltValue;
    }
    
    int findTiltSum(TreeNode node){
        if(node==null)
            return 0;
       int leftSum = findTiltSum(node.left);
       int rightSum = findTiltSum(node.right);
        
        tiltValue += Math.abs(leftSum-rightSum);
       return leftSum+rightSum+node.val;
    }
    
    
    
    
}

