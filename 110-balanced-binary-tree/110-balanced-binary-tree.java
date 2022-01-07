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
    public boolean isBalanced(TreeNode root) {
         if(root==null)
             return true;
            if(Math.abs(calculateHeight(root.right)-calculateHeight(root.left)) <=1 &&  isBalanced(root.left) && isBalanced(root.right)){
                 return true;
             } else{
                return false;
            }
          
    }
    
    int calculateHeight(TreeNode node){
        
        if(node==null)
            return -1;
        return 1+Math.max(calculateHeight(node.left),calculateHeight(node.right));
        
        
    }
    
   
}