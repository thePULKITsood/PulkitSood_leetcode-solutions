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
        // if (head==null || head.next==null) return head;
        
        ListNode mid = mid(head);
        ListNode newhead = mid.next;
        mid.next=null;
        newhead = reverse (newhead);
        // now adding one by one from both the lists 
        
        // we will run the loop with the list 2 and add the last element of list 1 in case of even list 
        ListNode c1 = head;
        ListNode c2 = newhead;
        
        // make 2 pointer instead of one to avoid the fucking null pointer exceptions 
        
        ListNode f1 = null;
        ListNode f2 = null;
//        if list is of even length both the pinters reach null ikathe 
        
//         and if the list is of odd length then the c2  pointers reaches null first 
        
        while (c2!=null)
        {//backup 
            
            f1=c1.next;
            f2=c2.next;
            
            // links 
            c1.next=c2;
            c2.next=f1;
            
            // move 
            c1 = f1;
            c2 = f2;
        }
        
        
        
    }
    public ListNode mid (ListNode head)
    {
        ListNode fp = head;
        ListNode sp = head;
        
        while (fp.next!=null && fp.next.next!=null) // it will gve hte left as the mid 
        {
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp;
    }
    
    public ListNode reverse (ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null; 
        
        while (curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            prev=curr;
            curr = forw;
            
        }
        return prev;
    }
}