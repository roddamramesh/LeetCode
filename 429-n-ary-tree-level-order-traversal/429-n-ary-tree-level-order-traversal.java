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
    List<List<Integer>> lst = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return lst;
        }
        Queue<Node> q= new LinkedList<Node>();
        
        q.offer(root);
     
        while(!q.isEmpty()){
            int count =q.size();
             List<Integer> lstOfIntegers=new ArrayList<Integer>();
            for(int i=0;i<count;i++){
                Node node= q.poll();
                lstOfIntegers.add(node.val);
                for(Node n:node.children){
                    q.offer(n);
                }
            }
            if(!lstOfIntegers.isEmpty()){
                  lst.add(lstOfIntegers);    
            }
        }
        
         
        return lst;
        
    }
}