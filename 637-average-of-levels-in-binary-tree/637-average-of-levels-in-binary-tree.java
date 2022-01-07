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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> lstOfVal = new ArrayList<Double>();
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int levelSize = q.size();
            double avg=0;
            for(int i=0;i<levelSize;i++){
                TreeNode node= q.poll();
                avg = avg +node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                 if(node.right!=null){
                    q.offer(node.right);
                }
            }
            avg=avg/levelSize;
            lstOfVal.add(avg);

        }
        return lstOfVal;
        
    }
}