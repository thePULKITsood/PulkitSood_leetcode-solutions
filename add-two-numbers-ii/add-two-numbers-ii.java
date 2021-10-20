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
        int n1 = len(l1);
        int n2 = len(l2);
        
        ListNode dummy = new ListNode(0);
        while (n1>0 && n2>0){
            int sum =0;
            
            if(n1>=n2){
               sum+=l1.val;
            l1=l1.next;
            n1--;
            }
            if(n1<n2){
                sum+=l2.val;
                l2=l2.next;
                n2--;
                
            }
            ListNode head = new ListNode(sum);
            head.next=dummy;
            dummy=head;
        }
        int carry=0;
        ListNode node = dummy;
        dummy=null;
        
        while (node!=null){
            int newsum = node.val+carry;
            ListNode temp = new ListNode(newsum%10,dummy);
            carry=newsum/10;
            dummy=temp;
            node = node.next;
            
        }
        return (dummy.val==0? dummy.next: dummy);
        
        
    }
    public int len (ListNode node){
        var len =0;
        while (node!=null)
        { len++;
        node=node.next;
        }
        return len;
    }
}