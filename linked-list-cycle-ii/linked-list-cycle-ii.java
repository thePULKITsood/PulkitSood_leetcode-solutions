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
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;
        
        
        //find the intersection
        ListNode intersect = getIntersect(head);
        if(intersect == null)
            return null;
        
        //now fast is at the intersection 
        
        ListNode slow =head;
        ListNode fast=intersect ;
        
       
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    ListNode getIntersect (ListNode head){
        ListNode slow =head;
        ListNode fast=head ;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
                return slow;
        }
        return null;
        
    }
}