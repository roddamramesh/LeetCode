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
    public List<Integer> rightSideView(TreeNode root) {
       
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        List<Integer> res = new LinkedList<Integer>();
         if(root==null){
            return res;
        }
        
        // On Each level you have to add the last node value
        q.offer(root);
        while(!q.isEmpty()){
            int lSize= q.size();
            for(int i=0;i<lSize;i++){
                TreeNode node= q.poll();
                if(node.left!=null){
                    q.offer(node.left);  
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                if(i+1==lSize){
                    res.add(node.val);  
                }   
            }
        }
        
        return res;
        
    }
}