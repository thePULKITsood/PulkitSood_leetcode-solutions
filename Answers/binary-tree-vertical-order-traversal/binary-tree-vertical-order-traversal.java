/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node ;
        int hl = 0;
        
        Pair (TreeNode node , int hl ){
            this.node = node ;
            this.hl  = hl;
        }
    } 
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        
        if (root == null ) return ans;
        
        int min =0;
        int max = 0;
        
        Map<Integer,List<Integer>> map = new HashMap();
        
        LinkedList<Pair> q = new LinkedList();
        
        q.addLast(new Pair(root,0));
        
        while (q.size()!=0)
            
            {
                Pair rem = q.removeFirst();
                
                TreeNode node = rem.node;
                int hl = rem.hl;
                
                if (hl>max)max=hl;
                if(hl<min)min=hl;
                
                map.putIfAbsent(hl , new ArrayList<Integer> ());
                map.get(hl).add(node.val);
                
                if (node.left != null) q.addLast(new Pair(node.left ,hl-1));
                
                if (node.right != null) q.addLast(new Pair(node.right ,hl+1));
                
                
                
            
        }
         
        for (int i = min ; i<=max ; i++)
        
            ans.add(map.get(i));
        
        return ans;
    }
   
    
}
