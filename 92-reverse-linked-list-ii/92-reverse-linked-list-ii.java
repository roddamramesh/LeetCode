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
    public ListNode reverseBetween(ListNode head, int p, int q) {
        
        if(head==null){
            return head;
        }
        
        ListNode curr_node= head;
        ListNode prev_node=null;
        
        while(p>1){
            prev_node= curr_node;
            curr_node= curr_node.next;
            p--;
            q--;
        }
        ListNode connecting_node = prev_node;
        ListNode tail_node=curr_node;
        
        while(q>0){
            ListNode next= curr_node.next;
            curr_node.next=prev_node;
            prev_node = curr_node;
            curr_node = next;
            q--;
        }
        
        if(connecting_node!=null){
            connecting_node.next=prev_node;
        } else {
            head= prev_node;
        }
        tail_node.next = curr_node;
        return head;
        
    }
}