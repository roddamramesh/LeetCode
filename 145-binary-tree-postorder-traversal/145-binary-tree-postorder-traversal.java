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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> lst= new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(!stack.isEmpty() || root!=null){
            if(root!=null){
                stack.add(root);
                root=root.left;
            } else{
                
                TreeNode temp = stack.peek().right;
                
                if(temp==null){
                     temp = stack.pop(); 
                    lst.add(temp.val);
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                         lst.add(temp.val);
                    }
                } else{
                    root=temp;
                }
                
               
              
            }
        }
        
        return lst;
    }
}