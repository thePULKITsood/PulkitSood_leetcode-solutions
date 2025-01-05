
class Solution {
    public ListNode sortList(ListNode head) {
        
         if (head == null || head.next == null)
            return head;
        
// this is the base case fo rhe recursion this will return a single 
// listnode and the divide step will be completed 
       
        ListNode mid = midnode(head);
        
        ListNode newhead = mid.next;
        
        mid.next=null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(newhead);
        
        return merge(left,right);
    }
    public ListNode midnode(ListNode head) 
    { 
        if (head==null || head.next==null) return head;
     
        ListNode fp = head;
        ListNode sp = head;
        
        while (fp.next!=null && fp.next.next!=null)
        {
            fp = fp.next.next;
            sp = sp.next;
        }
//       we have to do the most important step which is we must split the  list 
//       this is where the mistake happens --===>> null pointer exception 
    
         return sp;
     
    }
    
public ListNode merge (ListNode left , ListNode right )
{ 
    if (right ==null || left ==null )
        return (left==null ? left :right );
    
    ListNode head = new ListNode (0);
    ListNode temp = head ;
    
    while (left!=null && right !=null)
    {
        if (left.val<=right.val)
        {   temp.next=left;
            left=left.next;
        }
        else 
        {  temp.next=right;
            right =right.next;
        }
        temp = temp.next ;
    }
//      when we come out either one has become null
    // now we must add the remaining list to the temp 
   temp.next = (left!=null ? left : right);
    return head.next;
    
    
    
    
}
        
}