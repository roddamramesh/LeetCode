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
    public boolean isPalindrome(ListNode head) {
        
        ListNode sp=head;
        ListNode fp=head;
        
        while(fp!=null && fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        boolean flag = false;
       
        ListNode prev=null;
        ListNode curr=sp;
        
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        while(prev!=null && head!=null){
            if(prev.val==head.val){
                prev=prev.next;
                head=head.next;
            } else{
                return false;
            }
        }
        
        return true;
        
    }
}