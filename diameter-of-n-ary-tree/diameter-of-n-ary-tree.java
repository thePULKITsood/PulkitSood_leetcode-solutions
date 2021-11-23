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
    int max =0;
    public int diameter(Node root) {
        func (root);
        return max-1;
        
    }
    int func(Node root){
        if(root==null)return 0;
        
        //get the two biggest lengths 
        
        // make a dia meter with me  + two biggest lengths 
        
        // return biggest +1 
        
        int big1 =0;
        int big2 =0;
        
        for (Node n : root.children){
            int dia = func (n);
            if(dia>big2){
                big2=dia;
            }
            if(big2>big1){
                int temp=big1;
                big1=big2;
                big2=temp;
            }
        }
        
        
        
        
        int mydia = big1+big2+1;
        max=Math.max(max,mydia);
        return  big1+1;
        
        
    }
}