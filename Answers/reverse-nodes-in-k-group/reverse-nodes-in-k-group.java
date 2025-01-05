
class Solution {
    
    ListNode th = null;
    ListNode tt = null;
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null|| head.next== null || k==0) return head;
        int len = length(head);
        
        ListNode curr = head;
        
        ListNode oh = null; // original head 
        ListNode ot =null; // original tail 
    
        
        while (len>=k)
        {
            int tempk = k ;
            
            while (tempk-- > 0)
            {
                ListNode forw = curr.next; // basically storing the next node 
                curr.next=null;            // breaking the link 
                addfirstNode (curr);       // using the add first to add to curr.next=th   ; th=curr;
                curr=forw;                 // now do the same to the next node 
            }
            if (oh==null)        // now it oh ==null meaning first time 
            {
                oh =th;  // make them equal to the th and tt
                ot=tt;
                
            }
            else         // else original tail . next = th 
                         // and ot==tt 
            {
                ot.next=th;
                ot=tt;
            }
            
                th=null;
                tt=null;
            // at the end after processing nodes 
                len-=k;
        }
        ot.next=curr;
        return oh;
    }
    
    
    public void addfirstNode (ListNode node ) // just this function is important and make tt and th global variables                                               // for easy access ! 
    {
        if (th==null)  // if the first elemnt make the th and tt equal to it 
            
        {
            th=node;
            tt=node;
        }
        else
        {
            node.next=th;
            th=node;
        }
    }
    public int length (ListNode node )
    {
        int length = 0 ;
        ListNode curr =node ;
        while (curr!=null)
        {
            curr=curr.next;
            length++;
        }
        return length;
    }
}