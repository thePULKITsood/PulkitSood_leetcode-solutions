
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null|| head.next== null || k==0) return head;
        int len = length(head);
        
        ListNode curr = head;
        
        ListNode oh = null;
        ListNode ot =null;
        
        while (len>=k)
        {
            int tempk = k ;
            while (tempk-- > 0)
            {
                ListNode forw = curr.next;
                curr.next=null;
                addfirstNode (curr);
                curr=forw;
            }
            if (oh==null)
            {
                oh =th;
                ot=tt;
                
            }
            else 
            {
                ot.next=th;
                ot=tt;
            }
            
                th=null;
                tt=null;
                len-=k;
        }
        ot.next=curr;
        return oh;
    }
    
    
    ListNode th = null;
    ListNode tt = null;
    public void addfirstNode (ListNode node )
    {
        if (th==null)
        {
            th=node;
            tt=node;
        }
        else
        {node.next=th;
        th=node;}
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