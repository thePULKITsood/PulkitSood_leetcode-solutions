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
    public Node lowestCommonAncestor(Node p, Node q) {
        
//         here i am given node p and node q 
        
//         i will find the root to node path as i have the parent with me 
//         then i will traverse form the reverse and find the common ancstor 
        
        ArrayList<Node> pathp = new ArrayList();
       ArrayList<Node> pathq = new ArrayList();
        
        while (p!=null){
            pathp.add(p);
            p=p.parent;
        }
        
        while (q!=null){
            pathq.add(q);
            q=q.parent;
        }
        
        int i = pathp.size() - 1 ;
       int j = pathq.size() - 1 ;
        
        Node Lca = null;        
 
        while (i>=0 && j >=0 && pathp.get(i) == pathq.get(j))
        {
            Lca = pathp.get(i);
            i--;j--;
        }
        return Lca;
        
    }
}