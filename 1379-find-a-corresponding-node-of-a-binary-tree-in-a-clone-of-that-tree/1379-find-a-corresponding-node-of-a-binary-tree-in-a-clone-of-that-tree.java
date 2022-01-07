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
    TreeNode clonedTarget = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        getTargetCopy(cloned,target.val);
        return clonedTarget;
    }
    
    public void getTargetCopy(final TreeNode clonedNode,int target){
        if(clonedNode==null)
            return ;
        if(clonedNode.val==target){
            clonedTarget=clonedNode;
        }
        
        getTargetCopy(clonedNode.left, target);
        getTargetCopy(clonedNode.right, target);   
            
    }
}