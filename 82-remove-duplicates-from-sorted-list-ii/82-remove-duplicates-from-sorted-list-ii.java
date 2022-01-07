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
    public ListNode deleteDuplicates(ListNode head) {
        
        
        
        ListNode curr = head;
        ListNode prev = null;
        
        if(curr!=null && curr.next!=null){
         ListNode next = curr.next;
         
            while(next!=null){
                if(curr.val==next.val){
                    
                    while(next!=null && curr.val==next.val){
                        next= next.next;
                    }
                    if(prev==null){
                        if(next==null){
                            return null;
                        }
                        curr = next;
                        next= curr.next;
                        head=curr;
                    } else {
                        curr=prev;
                        curr.next=next;  
                    }
                   
                    
                } else {
                    prev=curr;
                    curr= curr.next;
                    next = next.next;
                   
                }
            }
        }
         return head;   
        
    }
}