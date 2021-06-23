/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // store the parent in a hashmap and then just perform a bfs search according to level and then it will become easy 
// this is basically a graph problem but as we can not go ackwards so we need ot make a mapping of parents to children so that we can go back and do a bfs -- so we create a hashmap 
// node - left right and parent -- for parent we will use hashmap  and a visited set is also required 
        

class Solution {
    
    Map<TreeNode ,TreeNode> map = new HashMap();
    List<Integer> res = new ArrayList();
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       
        if (root == null || k < 0) return res;
         buildMap(root, null);
        

        Set <TreeNode> visited = new HashSet();
        visited.add(null);
        
        LinkedList<TreeNode> q = new LinkedList();
        q.addLast(target);
        
        int level = 0;
        
        while(q.size() > 0){
            
            if (level == k ){
                while (q.size()>0){
                    TreeNode temp = q.removeFirst();
                    res.add(temp.val);
                }
                return res;
            }
            
            int size = q.size();
            while (size-- > 0){
                
                TreeNode temp = q.removeFirst();
                visited.add(temp);
                
//                 addits 3 things 
                
                TreeNode parent = map.get(temp);
                TreeNode left = temp.left;
                TreeNode right = temp.right;
                
                if (! visited.contains(parent))q.addLast(parent);
                if (! visited.contains(left))q.addLast(left);
                if (! visited.contains(right))q.addLast(right);
                
                visited.add(parent);
                visited.add(left);
                visited.add(right);
                
            }
            level++;
        }
        
        return res;
    }
    void buildMap(TreeNode node , TreeNode parent){
        if(node == null)return;
        
        map.put(node,parent);
        buildMap(node.left,node);
        buildMap(node.right,node);
    }
    
}