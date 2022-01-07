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
    public int sumNumbers(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        findRootToLeafValues(root,lst,10,0);
        int sum = 0;
        for(Integer val:lst){
            sum +=val;
        }
        return sum;
    }
    
    public void findRootToLeafValues(TreeNode root, List<Integer> lst,int multiplier,int val){
        
        if(root==null){
            return;
        } 
        val= (val*multiplier)+root.val; 
        if(root.left==null && root.right==null){
            lst.add(val);
        } 
            
        findRootToLeafValues(root.left,lst,multiplier,val);
        findRootToLeafValues(root.right,lst,multiplier,val);
        
        
    }
}