/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    /**
    *   With Floys Detection algorithm.
    *
    */
    public ListNode detectCycle(ListNode head) {
        
        ListNode sp = head;
        ListNode fp = head;
       
        while(fp!=null &&fp.next!=null){
            fp=fp.next.next;
            sp=sp.next;
            if(sp==fp){
                break;
            }
        }
        if(fp==null || fp.next==null){
            return null;
        }
       
        fp=head;;
        while(fp!=sp){
            fp = fp.next;
            sp=sp.next;
        }
        return sp;
        
    }
}