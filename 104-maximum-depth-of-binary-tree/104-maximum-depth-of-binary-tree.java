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
    private int answer =0; 
    public int maxDepth(TreeNode root) {
       
         findMaxDepth(root,1);
        return answer;
        
    }
    
    void findMaxDepth(TreeNode root,int depth){
          if(root==null){
                return;
            }
        if(root.left==null && root.right==null ){
            answer= Math.max(answer,depth);
        }
        findMaxDepth(root.left,depth+1);
        findMaxDepth(root.right,depth+1);
    }
    
}