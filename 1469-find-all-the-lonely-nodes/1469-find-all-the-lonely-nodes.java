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
 * Logic : For Left right node should be null and for right leftnode should be null
 */
class Solution {
    public List<Integer> getLonelyNodes(TreeNode root) {
        
        List<Integer> nodes = new ArrayList<>();
        getLonelyNodes(root,nodes);
        return nodes;
    }
    
    public void getLonelyNodes(TreeNode root, List<Integer> nodes){
        if(root==null)
            return;
        if(root.left!=null && root.right==null)
            nodes.add(root.left.val);
        if(root.right!=null && root.left==null)
            nodes.add(root.right.val);
        getLonelyNodes(root.left,nodes);
        getLonelyNodes(root.right,nodes);
    }
}