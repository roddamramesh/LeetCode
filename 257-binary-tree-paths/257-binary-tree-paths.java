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
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> currPath = new ArrayList<>();
        List<List<Integer>> allPaths = new ArrayList<>();
        List<String> lstOfAllPath= new ArrayList<>();
        
        binaryTreePaths(root,allPaths,currPath);
        
        allPaths.forEach(cPath->{
          lstOfAllPath.add(cPath.stream().map(Object::toString).collect(Collectors.joining("->")));
        });
        
        
        return lstOfAllPath;
    }
    
    public void binaryTreePaths(TreeNode node,List<List<Integer>> allPaths, List<Integer> currPath){
        if(node==null)
            return;
       
        currPath.add(node.val);
        if(node.left==null && node.right==null){
           allPaths.add(new ArrayList<Integer>(currPath)); 
        }else {
           binaryTreePaths(node.left,allPaths,currPath);
            binaryTreePaths(node.right,allPaths,currPath); 
        }
        currPath.remove(currPath.size()-1);
    }
}