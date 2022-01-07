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
    public boolean isCousins(TreeNode root, int x, int y) {
        Stack<Integer> xstack= new Stack<Integer>();
        Stack<Integer> ystack= new Stack<Integer>();
        boolean xres=findPath(root,x,xstack);
        boolean yres=findPath(root,y,ystack);
        
        if(!(xres==true && yres==true)){
            return false;
        }
        
        while(!xstack.isEmpty() && !ystack.isEmpty() && xstack.peek()==ystack.peek()){
            xstack.pop();
            ystack.pop();
        }
        
        if(xstack.size()==ystack.size() && xstack.size()>=2)
            return true;
          
     return false;
       
        
    }
    
    public boolean findPath(TreeNode root, int target,Stack<Integer> stack){
        if(root==null)
            return false;
        if(root.val==target){
            stack.push(root.val);
            return true;
        }
        
        boolean leftSubTree = findPath(root.left,target,stack);
        boolean rightsubTree =  findPath(root.right,target,stack);
        if(leftSubTree)
            stack.push(root.val);
        if(rightsubTree)
            stack.push(root.val);
        return leftSubTree || rightsubTree;
        
    }
}