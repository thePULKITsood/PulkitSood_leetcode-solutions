/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) return ans;
        bfs (root);
        return ans;
        
    }
    void bfs (Node root){
        
        LinkedList <Node > q = new LinkedList();
        
        q.addLast(root);
        
        while (q.size ()!=0)
        {
            int size = q.size();
            
            List<Integer> mini = new ArrayList();
            
            while (size -- > 0){
                
                Node rem = q.removeFirst();
                
                mini.add(rem.val);
                
                for (Node ch : rem.children){
                  if(ch!=null)  q.addLast(ch);
                }
            }
            ans.add(mini);
        }
    }
    
}