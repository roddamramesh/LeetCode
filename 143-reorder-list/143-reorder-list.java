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
    public void reorderList(ListNode head) {
        
        if(head!=null){
            ListNode sp=head;
            ListNode fp=head;
            // Valid for even and odd size of list
            while(fp!=null &&fp.next!=null){
                sp=sp.next;
                fp=fp.next.next;
            }
            //point to the next node to reverse from the half
             ListNode curr= sp;

            curr=sp.next;

            ListNode prev= null;
            //Reverse Logic
            while(curr!=null){
                ListNode next= curr.next;
                curr.next=prev;
                prev= curr;
                curr=next;
            }
            sp.next=null;
            ListNode temp=head;
            //For every alternate node attach from reversed list. and make the temp pointing to next
            while(temp!=null&& prev!=null){
                ListNode next = temp.next;
                temp.next=prev;
                prev=prev.next;
                temp.next.next=next;
                temp=next;

            }
            
        }
        
        

        
    }
}