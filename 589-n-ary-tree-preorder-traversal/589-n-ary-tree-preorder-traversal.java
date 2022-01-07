/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> lst = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
         if(root!=null){
               lst.add(root.val);
            List<Node> listOfChildren =root.children;
            for(int i=0;i<listOfChildren.size();i++){
                Node node= listOfChildren.get(i);
                preorder(node);
            }
            
        }
        return lst;
        
    }
}