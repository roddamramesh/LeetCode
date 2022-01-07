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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
     Queue<TreeNode> queue= new LinkedList<>();
        if(p==null&& q==null){
            return true;
        } else if(p==null||q==null){
            return false;
        } 
            queue.offer(p);queue.offer(q);
            
            while(!queue.isEmpty()){
                TreeNode nodep= queue.poll();
                TreeNode nodeq= queue.poll();
                if(nodep==null && nodeq==null)
                    continue;
                 if(nodep== null || nodeq== null)
                    return false;
    
                if(nodep.val!=nodeq.val)
                    return false;
                queue.offer(nodep.left);
                queue.offer(nodeq.left);
                queue.offer(nodep.right);
                queue.offer(nodeq.right);          
            }
        
        return true;
    }
}