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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        Stack<Integer> stack1= new Stack<>();
        Stack<Integer> stack2= new Stack<>();
        findLeafNodes(root1,stack1);
        findLeafNodes(root2,stack2);
        while(!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek()==stack2.peek()){
            stack1.pop();
            stack2.pop();
        }
        
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }
        return false;
        
    }
    
    public void findLeafNodes(TreeNode root,Stack<Integer> stack) {
        
        if(root==null)
            return ;
        if(root.left==null && root.right==null)
            stack.push(root.val);
        findLeafNodes(root.left,stack);
        findLeafNodes(root.right,stack);
        
    }
    
}