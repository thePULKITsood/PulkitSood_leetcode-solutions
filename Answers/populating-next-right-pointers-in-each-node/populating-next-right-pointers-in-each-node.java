/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/


/*

pep coding video jaroori hai ye bohot 

https://www.youtube.com/watch?v=3MRPQFUpoA0


We only move on to the level N+1 when we are done establishing the next pointers for the level N. Since we have access to all the nodes on a particular level via the next pointers, we can use these next pointers to establish the connections for the next level or the level containing their children.


*/
class Solution {
    public Node connect(Node root) {

        if(root==null)return root;
        
      Node leftMost = root;
        
        while (leftMost.left!=null){
            Node head = leftMost;
            
            while (head != null) {
                
                // CONNECTION 1
                head.left.next = head.right;
                
                // CONNECTION 2
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                
                // Progress along the list (nodes on the current level)
                head = head.next;
            }
            
            leftMost=leftMost.left;
        }
        return root;
    }
}