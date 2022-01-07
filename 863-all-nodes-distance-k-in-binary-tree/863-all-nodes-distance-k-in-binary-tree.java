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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        List<Integer>  lst = new ArrayList<Integer>();
        nodeToRoot(root,target.val,queue);
        TreeNode blockNode = null;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            distanceFromParentNode(node,k,lst,blockNode);
            blockNode= node;
            k--;
           
        }
        
        return lst;
        
    }
    // Print all nodes away from k nodes
    public void distanceFromParentNode(TreeNode node,int k,List<Integer> lst,TreeNode blockNode){
        if(node==null || k<0 || blockNode==node ){
            return;
        }
        if(k==0){
            lst.add(node.val);
        }
        
        distanceFromParentNode(node.left,k-1,lst,blockNode);
        distanceFromParentNode(node.right,k-1,lst,blockNode);
        
    }
    
    // Finding node to root and adding it into Queue
    public boolean nodeToRoot(TreeNode node, int k,Queue<TreeNode> q){
        
        if(node==null)
            return false;
        
       if(node.val==k){
           q.offer(node);
           return true;
       }
        
        boolean leftNodeRes = nodeToRoot(node.left,k,q);
        if(leftNodeRes){
            q.offer(node);
             return true;
        }
        
         boolean rightNodeRes = nodeToRoot(node.right,k,q);
        if(rightNodeRes){
            q.offer(node);
             return true;
        }  
     return false;
    }
    
}