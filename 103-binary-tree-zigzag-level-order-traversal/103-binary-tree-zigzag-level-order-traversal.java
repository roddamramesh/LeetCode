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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> lstOfLstVal = new ArrayList<List<Integer>>();
        if(root==null){
            return lstOfLstVal;
        }
        
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int levelSize= q.size();
            List<Integer> lst= new LinkedList<Integer>();
            for(int i=0; i<levelSize ; i++){
                TreeNode node= q.poll();
                
                if(flag){
                    lst.add(node.val); 
                } else{
                     lst.add(0,node.val); 
                }
               
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                
            }
        
            lstOfLstVal.add(lst);
             
            flag = !flag;
         
            
        }
        
        return lstOfLstVal;
        
    }
}