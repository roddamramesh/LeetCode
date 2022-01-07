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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null)
            return null;
     
        ListNode sp=head;
        ListNode fp= head.next;
        
        while(fp!=null){
            if(fp.val==val){
                  fp=fp.next;
                  sp.next=fp;
            } else{
                fp=fp.next;
                sp=sp.next;
            }
             
        }
        
        while(head!=null &&head.val==val){
            head=head.next;
        }
        return head;
        
    }
}