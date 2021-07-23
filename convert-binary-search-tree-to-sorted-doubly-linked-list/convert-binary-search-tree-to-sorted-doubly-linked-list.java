/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node head = null;
    Node prev = null;
    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        
        inorder (root);
        
        prev.right=head;
        head.left=prev;
        return head;
        
    }
   void inorder (Node root){
        if (root==null)return ;
        
        inorder(root.left);
        
        if(head==null){
            head=root;
            
        }
        if(prev!=null){
        prev.right = root;
        root.left = prev;
        }
       
       
        prev = root ;
        inorder (root.right);
        
        
    }
}