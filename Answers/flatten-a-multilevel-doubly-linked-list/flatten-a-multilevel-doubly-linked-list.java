/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)return head;
        Node it = head;
        
        while (it!=null){
            
            if(it.child!=null){
                Node next = it.next;
                
                it.next=flatten(it.child);
                
                //change pointers
                it.next.prev=it;
                it.child=null;
            
                
                //now move to the last part of the flattened child list 
                while (it.next!=null)
                    it=it.next;
                
                // now to this part add the next 
                
                if(next!=null){
                    it.next=next;
                    it.next.prev=it;    
                }
                
            }
            
            //if it is null then simply move 
            it=it.next;
        }
        return head;
        
    }
}