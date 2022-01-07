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
    public void flatten(TreeNode root) {
       
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
   
        while(root!=null){
        stack.push(root.right);
        root.right=root.left;
        root.left=null;
      
            while(root.right==null && !stack.isEmpty()){
                TreeNode temp1=stack.pop();
                if(temp1!=null)
                    root.right=temp1;

            }
            root= root.right;
        }
            
        root=node;  
    
        
    }
}