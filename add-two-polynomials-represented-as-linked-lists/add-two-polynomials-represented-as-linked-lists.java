/**
 * Definition for polynomial singly-linked list.
 * class PolyNode {
 *     int coefficient, power;
 *     PolyNode next = null;
 
 *     PolyNode() {}
 *     PolyNode(int x, int y) { this.coefficient = x; this.power = y; }
 *     PolyNode(int x, int y, PolyNode next) { this.coefficient = x; this.power = y; this.next = next; }
 * }
 */

class Solution {
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
        PolyNode p1 = poly1 , p2=poly2;
        
        PolyNode head=new PolyNode();
        PolyNode curr = head;
        
        while (p1!=null && p2!=null)
        {
            if (p1.power>p2.power)
            {
                curr.next=p1;
                p1=p1.next;
                curr=curr.next;
                
            }
            else if (p1.power < p2.power)
            {
                curr.next=p2;
                p2=p2.next;
                curr=curr.next;
            }
            else 
            {
                int coefficient = p1.coefficient + p2.coefficient;
                int power = p1.power;
                if (coefficient !=0)
                {
                curr.next=new PolyNode(coefficient,power,null);
                     curr=curr.next;
                }
                
                p1=p1.next;
                p2=p2.next;
            }
            
        }
        curr.next = p1!=null ?p1 : p2;
        return head.next;
        
        
    }
}