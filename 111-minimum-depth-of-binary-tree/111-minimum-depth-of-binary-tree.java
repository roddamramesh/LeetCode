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
    public int minDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.offer(root);
        int minDepth=0;

        while(!q.isEmpty()){
            int lSize =q.size();
            minDepth++;
            for(int i=0;i<lSize;i++){
                TreeNode node= q.poll();
                 if(node.left==null && node.right==null){
                    return minDepth;
                }
                 if(node.left!=null){
                     q.offer(node.left);
                 } 
                if(node.right!=null){
                    q.offer(node.right);
                }
               
               
                
            }
        }
        
        return minDepth;
    }
}