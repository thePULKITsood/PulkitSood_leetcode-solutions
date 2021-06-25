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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode  head = new ListNode(0);
        ListNode temp =head;
//          the linked list start from result . next and we have used prev as a linked list to add stuff to it 
        while(l1!=null && l2 !=null)
        {
            if (l1.val <= l2.val)
            {
                temp.next=l1;
                l1=l1.next;
            }
            else 
            {
                temp.next = l2;
                l2= l2.next;
            }
            temp = temp.next;
        }
        temp.next = ( l1!=null ? l1 : l2);
       
            // this will add the whole list if something is left 
        
        return head.next;
        
    }
}