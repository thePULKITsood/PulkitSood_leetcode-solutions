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
    public ListNode rotateRight(ListNode head, int k) {
        // base cases
    if (head == null) return null;
    if (head.next == null) return head;
        
        int n = 1;
        ListNode temp = head;
        while (temp.next!=null){
            n++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%n;
        ListNode newTail =head;
        for (int i =1;i<n-k;i++)
            newTail=newTail.next;
        
        head=newTail.next;
        newTail.next=null;
        return head;
        
    }
}