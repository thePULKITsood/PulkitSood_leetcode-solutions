/**
 * Definition for Node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node random;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right, Node random) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *         this.random = random;
 *     }
 * }
 */

class Solution {
    HashMap<Node , NodeCopy > map = new HashMap();
    public NodeCopy copyRandomBinaryTree(Node root) {
        
        if(root==null) return null;
        //left  -> right -> root 
        map.put(null,null);
        func(root);
        fun2(root);
        return map.get(root);
        
    }
   void func(Node root){
        if(root==null)return ;
        
        if(!map.containsKey(root)){
            map.put(root,new NodeCopy (root.val));
        }
        
        //left
       func(root.left); 
        
        //right
       func(root.right);
       
   }
    void fun2(Node root){
        if(root==null)return;
        NodeCopy copy = map.get(root);
        copy.left = map.get(root.left);
        copy.right = map.get(root.right);
       copy.random=map.get(root.random); 
        fun2(root.left);
        fun2(root.right);    }
}