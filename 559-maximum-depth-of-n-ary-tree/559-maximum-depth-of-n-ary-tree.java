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
    public int maxDepth(Node root) {
        
        if(root==null){
            return 0;
        }
        Queue<Node> qList = new LinkedList<Node>();
        
        qList.offer(root);
        int maxDepth=0;
        while(!qList.isEmpty()){
           int levelSize= qList.size();
     
            maxDepth++;
           
            for(int i=0; i<levelSize; i++){
                Node node = qList.poll();
                List<Node> lst = node.children;
            
                for(Node nod: lst){
                    qList.offer(nod);
                }
              
             
            }
        }
        return maxDepth;
        
    }
}