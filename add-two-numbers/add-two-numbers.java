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
        
//          here the only trick is that we must make our answer by using the  
//          add first technique so that we dont have to reverse our answer 
       ListNode head =new ListNode (0) ;
        ListNode prev = head;
        int carry = 0;
        while (l1!=null || l2!=null)
        {
            int x1 = (l1!=null ?l1.val : 0 );
            
            int x2 = (l2!=null ?l2.val : 0 );
            
            
                int val = (x1+x2+carry )%10;
                 carry = (x1+x2+carry )/10;
            
             
            prev.next=new ListNode (val);
            prev=prev.next;
            l1= (l1!=null ? l1.next :null);
            
            l2= (l2!=null ? l2.next :null);
            
        }
        if (carry>0)
        {
            prev.next=new ListNode (carry);
            // prev=prev.next;
            
        }
        return head.next;
        
    }
}