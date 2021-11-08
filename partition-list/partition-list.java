class Solution {
    public ListNode partition(ListNode head, int x) {
	if (head==null )return head;

	ListNode head1 = new ListNode (0);
	ListNode before = head1;
	ListNode head2 = new ListNode (0);
	ListNode after = head2;
	
	ListNode curr = head;
		
	while (curr!=null){
	
	ListNode forw= curr.next;
// just to store the next one 
	if (curr.val < x){
	before.next=curr;
	before=before.next;
	before.next=null;	 

	}
	else{
	after.next=curr;
	after=after.next;
	after.next=null;
	}
	curr=forw;


	}
	before.next=head2.next;

	return head1.next;
        
    }
}