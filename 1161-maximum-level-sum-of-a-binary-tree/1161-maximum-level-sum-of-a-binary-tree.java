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
    public int maxLevelSum(TreeNode root) {
        int[][] arr = new int[1][2];
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int maxSum=-Integer.MAX_VALUE;
        int level = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int lSize= q.size();
           
            int sum = 0;
            level++;
            for(int i=0; i<lSize;i++){
                TreeNode node= q.poll();
                sum = sum + node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            if(sum>maxSum){
                maxSum=sum;
                arr[0][0] = level;
                arr[0][1] = maxSum;
            }
            
        }
        
        return arr[0][0];
        
    }
    
   
}