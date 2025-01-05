/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode ,TreeNode> map = new HashMap();
    List<Integer> res = new ArrayList();
    
    void buildMap(TreeNode node , TreeNode parent){
        if(node == null)return;
        
        map.put(node,parent);
        buildMap(node.left,node);
        buildMap(node.right,node);
    }
    
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        if (root == null || k < 0) return res;
         buildMap(root, null);
        
         Set <TreeNode> visited = new HashSet();
        visited.add(null);
        
        Queue<TreeNode> q = new LinkedList();
        q.add(target);
        int level =0;
         while(q.size() > 0){
            
            if (level == k ){
                while (q.size()>0){
                    res.add(q.remove().val);
                }
                return res;
            }
            
            int size = q.size();
            while (size-- > 0){
                
                TreeNode temp = q.remove();
                visited.add(temp);
                
//                 addits 3 things 
                
                TreeNode parent = map.get(temp);
                TreeNode left = temp.left;
                TreeNode right = temp.right;
                
                if (! visited.contains(parent))q.add(parent);
                if (! visited.contains(left))q.add(left);
                if (! visited.contains(right))q.add(right);
                
                visited.add(parent);
                visited.add(left);
                visited.add(right);
                
            }
            level++;
        }
        return res;
    }
}