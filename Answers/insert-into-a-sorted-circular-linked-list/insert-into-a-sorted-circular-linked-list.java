/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        Node toInsert = new Node (insertVal);
        
        if(head==null){
            
            toInsert.next=toInsert;
            return toInsert;
        
        }
        Node temp = head;
        
        while (temp.next!=head){
            if(temp.val<=temp.next.val){
                if(insertVal>=temp.val && insertVal<= temp.next.val)
                    break;
            }
            else {
                // meaning this is the ending point 
                // we need only one condition 
                // if it is bigger than this one or smaller than the next one 
                
                if(insertVal>=temp.val || insertVal<= temp.next.val)
                    break;
            }
           temp=temp.next; 
        }
        Node next = temp.next;
        temp.next=toInsert;
        toInsert.next=next;
        
        return head;
        
        
    }
}