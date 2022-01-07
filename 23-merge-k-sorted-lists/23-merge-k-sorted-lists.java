/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> minHeap= new PriorityQueue<>((m1,m2)->m1.val-m2.val);
       
     // Use Min Heap Concept
       for(ListNode node: lists){
          if(node!=null)
              minHeap.add(node);
        
       } 
        
        ListNode head= null;
        ListNode tail= null;
        while(!minHeap.isEmpty()){
            ListNode node = minHeap.poll();
            if(head==null){
                head=tail=node;
            } else{
                tail.next = node;
                tail = tail.next;
            }
            if(node.next!=null){
              minHeap.add(node.next);   
            }   
        }
        
       
        return head;
    }
}