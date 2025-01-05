/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node,Node> map = new HashMap();
    public Node cloneGraph(Node node) {
        if(node==null)return node;
        
        Node copy = new Node (node.val);
        
        if(!map.containsKey(node)){
            map.put(node,copy);   
        
        ArrayList<Node> list = new ArrayList();
        
        for (Node n : node.neighbors){
            list.add(cloneGraph(n));
        }
        map.get(node).neighbors = list;
        }
        return map.get(node);
    }
}