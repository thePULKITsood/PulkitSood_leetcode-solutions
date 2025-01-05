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
        
//          1. find the mid point 
//          2. then reverse the 2nd linked list 
//         3.  then check if the two lists are same 
             // if (head==null || head.next==null) return head;
      
        ListNode mid = mid(head);
        ListNode newhead = mid.next;
        
        mid.next=null; // breaking the old list 
        newhead = reverse (newhead);
        
        ListNode c1 =head;
        ListNode c2 = newhead ;
        
        boolean ans = true ;
        while (c2!= null ) 
            
// for the odd we can apply the  loop only on the c2 as that will become nulll first 
//             and the mid element is amse thius no need to check it 
        {
            if (c1.val !=c2.val)
            {
                ans = false ;
                break;
            }
            c1 = c1.next ;
            c2 = c2.next ;
            
        }
//          jo list break kri thi we have to make that list correct
        
        newhead = reverse (newhead);
        mid.next=newhead;
        return ans ;
        
    }
    public ListNode reverse (ListNode head)
    {
        if (head==null || head.next==null) return head;
        ListNode curr = head;
        ListNode prev = null ;
        ListNode forw = null;
        while (curr!=null)
        {
            forw= curr.next;  // backup 
            curr.next=prev; // link  
            prev=curr;  
            curr=forw;
        }
        return prev;
    }
    public ListNode mid (ListNode head)
    {
        if (head==null || head.next==null) return head;
        ListNode sp = head;
        ListNode fp = head;
        while (fp.next!=null&& fp.next.next!=null)
        // fast.next.next gives the left one in case of the even list 
                {
                    fp = fp.next.next;
                    sp=sp.next;
                    
                }
        return sp;
    }
}