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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList <TreeNode > list1 = new ArrayList<TreeNode>();
        ArrayList <TreeNode > list2 = new ArrayList<TreeNode>();
        
            nodetorootpath(root , p ,list1 );
        
            nodetorootpath(root , q ,list2 );
        int i = list1.size()-1;
        int j  = list2.size()-1;
        
        TreeNode LCA = null;
        while (i >= 0 && j >=0){
            if (list1.get(i) == list2.get(j)) LCA = list1.get(i);
            
            i--;j--;
        }
        return LCA;
        
    }
//      make a root ot node path and and then call if for both the nodes and then check from the left side for the common parent 
    
    public boolean nodetorootpath(TreeNode root , TreeNode p , ArrayList<TreeNode> ans ){
        if (root == null) return false;
        
        if (root == p ){
            ans.add(root);
            return true;
        }
        boolean res = nodetorootpath (root.left  , p , ans )|| nodetorootpath(root.right , p , ans);
        
        if (res){
            ans.add(root);
        }
        return res;
    }
}