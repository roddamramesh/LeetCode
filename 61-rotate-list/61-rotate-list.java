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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null){
            return head;
        }
        
        ListNode curr= head;
        ListNode next= null;
        int count=0;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        
        int rot = k % count;
        int startPos= count-rot;
        
        if(rot==0){
            return head;
        }
         curr= head;
    
        for(int i=0;i<startPos;i++){
            curr= curr.next;
        }
     
       
        ListNode lastNodeOfSubList= curr;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        
        
        for(int i=0;i<startPos;i++){
            curr= curr.next;
        }
        curr.next= null;
        return lastNodeOfSubList;
        
        
        
    }
}