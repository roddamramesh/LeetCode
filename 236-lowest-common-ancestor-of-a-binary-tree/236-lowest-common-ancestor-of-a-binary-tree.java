/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lcaNode=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lca(root,p,q);
        
        return lcaNode;
    }
    
    public boolean lca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)
            return false;
        
        boolean self = (root==p ||root==q);
        
        boolean left = lca(root.left,p,q);
        boolean right = lca(root.right,p,q);
         
        if((left && right) || (self && right) ||(self && left))
           lcaNode=root;
       return self||right||left;    
    }
}