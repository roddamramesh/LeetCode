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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
       TreeNode node = removeLeafNodes(root,null,target);
        if(node.left==null && node.right==null && node.val==target)
            return null;
        return node;
    }
    
    
    public TreeNode removeLeafNodes(TreeNode node,TreeNode parentNode,int target){
        
        if(node==null)
            return null;
        removeLeafNodes(node.left,node, target);
        removeLeafNodes(node.right,node, target);
        //Do the check in post order
        if(node.left==null && node.right==null){
           if(parentNode!=null && parentNode.left==node && node.val==target){
                parentNode.left=null;
            } else if(parentNode!=null && parentNode.right==node && node.val==target) {
               parentNode.right=null;
           }
        }
        return node;
    }
}