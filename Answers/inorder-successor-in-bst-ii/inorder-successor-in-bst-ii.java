/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right!=null){
            node=node.right;
            while (node.left!=null)
                node = node.left;
            
            return node;
        }
        while (node.parent!=null && node==node.parent.right)
            node=node.parent;
        
        return node.parent;
        
    }
}
/*


1. If the node has a right child, and hence its successor is somewhere lower in the tree. Go to the right once and then as many times to the left as you could. Return the node you end up with.

2. Node has no right child, and hence its successor is somewhere upper in the tree. Go up till the node that is left child of its parent. The answer is the parent.

*/