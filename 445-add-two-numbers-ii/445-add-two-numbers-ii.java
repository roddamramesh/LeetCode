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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        ListNode start = null;
        int carry=0;
        // Reverse List
         l1= reverse(l1);
         l2= reverse(l2);
        // Add them
        while(l1!=null || l2!=null){
            int sum = (l1!=null?l1.val:0) + (l2!=null?l2.val:0)+carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            node.next=start;
            start=node;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
        }
        
        if(carry==1){
            ListNode node= new ListNode(carry);
            node.next= start;
            start=node;
        }
            
        
      return start;
    } 
    
    public ListNode reverse(ListNode head){
        
        ListNode prev=null;
        ListNode curr= head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
}