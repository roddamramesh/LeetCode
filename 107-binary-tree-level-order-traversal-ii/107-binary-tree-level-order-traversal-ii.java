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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> result = new LinkedList<List<Integer>>();
      
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue =  new LinkedList<TreeNode>();
     
        queue.offer(root);
   
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> lstOfValues = new LinkedList<Integer>();
            
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                if(currentNode!=null){  
                    lstOfValues.add(currentNode.val);
                    queue.offer(currentNode.left);
                    queue.offer(currentNode.right);
                }
            }
            if(!lstOfValues.isEmpty()){
                result.add(0,lstOfValues);
            }
            
        }
        return result;
        
    }
}