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
    public ListNode reverseList(ListNode head) {
        
        
        if (head == null || head.next ==null) return head; 
        return func(head);

    }
   ListNode func( ListNode head){
        
        if (head== null || head.next ==null )return head  ;
        ListNode next = func(head.next);
        head.next.next=head;
        head.next=null;
        return next;
       // as recursion has returned me the head of the whole reversed linked list so i eill return the head (which rec returned) and not something else 
    }
}