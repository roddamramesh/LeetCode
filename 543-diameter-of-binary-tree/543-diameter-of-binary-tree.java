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
    public int diameterOfBinaryTree(TreeNode root) {
       return getDiameter(root).diameter; 
    }
    
    public DiaPair getDiameter(TreeNode node){
        
        if(node==null){
            DiaPair defaultDia= new DiaPair();
            defaultDia.height=-1;
            defaultDia.diameter=0;
            return defaultDia;
        }
        
        DiaPair left = getDiameter(node.left);
        DiaPair right = getDiameter(node.right);
        
        DiaPair dia = new DiaPair();
        dia.height= Math.max(left.height,right.height)+1;
 
        dia.diameter= Math.max(left.height+right.height+2,Math.max(left.diameter,right.diameter));
        return dia;
    }
    
    
}

public class DiaPair{
    int height;
    int diameter;
}