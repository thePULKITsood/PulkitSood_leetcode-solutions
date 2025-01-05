/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return head;
        
            HashMap<Node,Node>map = new HashMap();
            Node temp = head;
             while (temp!=null){
                Node newnode= new Node(temp.val);
                map.put(temp,newnode);
                temp=temp.next;
            }
            temp=head;
            while (temp!=null){
                map.get(temp).next=map.get(temp.next);
                
                 map.get(temp).random=map.get(temp.random);
                temp=temp.next;
            }
            
            return map.get(head);
            
            
            
            
            
            
            
            
            
    }  
        
    }
            
//         if (head==null)return head;
        
// //          not using space 
// //         1st step adding the extra nodes for the list 
        
//         Node curr = head;
        
//         while (curr!=null)
//         {
//             Node newnode = new Node (curr.val);
            
//             Node  forw = curr.next;  //backup
            
//             curr.next = newnode ;
            
//             newnode.next = forw;
            
//             curr=forw; // or curr == curr.next.next;
            
//         }
        
// //         2nd step is to add the random pointers 
     
        
//         curr=head;
//         while (curr!=null)
//         {
            
//         curr.next.random=(curr.random!=null ? curr.random.next : null );
            
//             curr=curr.next.next;
//         }
        
// //          3rd step is to break the links and make two lists 
        
//         curr  = head;
//         Node next = null;
//         Node  newhead = head.next;
//         Node copy=null;
//         Node copyitr = newhead;
//         while (curr!=null)
            
//         {
// //              clearly and closely see the concept of making the code look good and understandable 
//             next=curr.next.next;
            
//             //extraxt the copy 
//             copy=curr.next;
//             copyitr.next=copy;
//             copyitr=copy;
            
         
//          curr.next=next;
//          curr=next;
            
            
//         }
//         return newhead;
//         }
        
//         if (head==null ) return head;
//         Node cur = head;
//         while (cur != null)
//         {
//             Node next = cur.next;
//             cur.next=new Node (cur.val);
//             cur.next.next=next; // basically making the new node next as the next 
//             cur = next;
//         }
//         cur=head;
//         while (cur!=null)
//         {
//             cur.next.random = (cur.random!=null ? cur.random.next : null);
//             cur = cur.next.next;
//         }
//         cur = head;
//         Node copyhead = head.next;
//         while (cur!=null)
//         {
//             Node next = cur.next.next;
//             Node copy = cur.next;
            
//             cur.next= next;
//             copy.next = (next!=null ? next.next : null);
//             cur = next;
//         }
//         return copyhead;
        
        
//     }
            
