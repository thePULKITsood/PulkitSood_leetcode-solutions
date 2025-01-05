/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    
    public Node() {
        children = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }
    
    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    HashMap<Node , Node > map = new HashMap();
    public Node cloneTree(Node root) {
        if(root==null)return null;
        map.put(null,null);
        func(root);
        return map.get(root);
        
        
    }
    void func(Node root){
        if(root==null)return;
        
        if(!map.containsKey(root))
            map.put(root,new Node (root.val));
        
        
        for (Node c : root.children){
        
        if(!map.containsKey(c))
            map.put(c,new Node (c.val));
            
          Node rootClone = map.get(root);
          Node childClone  = map.get(c);
            
          rootClone.children.add(childClone);
          
          func(c);
        
            
        }
    }
}