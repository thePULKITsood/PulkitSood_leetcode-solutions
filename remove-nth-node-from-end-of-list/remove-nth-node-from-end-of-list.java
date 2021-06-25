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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) return head;
        ListNode dummy = new ListNode (0);
        dummy.next=head;
        
        // as we have to remove the kth node and not return it thus we want a prev node also 
        
        // for this we will use a prev node concept
        
        ListNode fp = dummy ;
        ListNode sp = dummy ;
        ListNode prev=dummy ;
        while (n-- > 0)
        {
            fp=fp.next;
        }
        while (fp!=null)
        {    prev = sp;
            sp=sp.next;
            fp=fp.next;
            
        }
        prev.next = sp.next;
        
        return dummy.next;
    }
}