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
        int col = 0;
        int level=0;
        
        Pair (TreeNode node , int col,int level ){
            this.node = node ;
            this.col  = col;
            this.level=level;
        }
    }
        
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        
        if (root == null ) return ans;
        
        int min =0;
        int max = 0;
        
        Map<Integer,ArrayList<Pair>> map = new HashMap();
        
        Queue<Pair> q = new LinkedList();
        
        q.add(new Pair(root,0,0));
        while (q.size()!=0)
            
            {
                Pair rem = q.remove();
                
                TreeNode node = rem.node;
                int col = rem.col;
                int level = rem.level;
                
                if (col>max)max=col;
                if(col<min)min=col;
                
                map.putIfAbsent(col , new ArrayList<Pair> ());
                map.get(col).add(rem);
                
                if (node.left != null) q.add(new Pair(node.left ,col-1,level+1));
                
                if (node.right != null) q.add(new Pair(node.right ,col+1,level+1));
                              
                
            
        }
         
        for (int i = min ; i<=max ; i++){
            ArrayList<Pair> list=map.get(i);
            if(list==null)continue;
            Collections.sort(list,(a,b)->(a.level==b.level ? a.node.val-b.node.val : a.level-b.level));
            
            ArrayList<Integer> minans = new ArrayList();
            for (Pair p : list){
                minans.add(p.node.val);
            }
            ans.add(minans);
        }
        
        
        return ans;
    
        
    }
}