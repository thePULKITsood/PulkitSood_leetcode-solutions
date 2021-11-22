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
    List<TreeNode> ans = new ArrayList();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    
        // do the stuff in post order 
        Set<Integer> set = new HashSet();
        for (int i :to_delete) set.add(i);
        
        func(root, set);
        if(!set.contains(root.val))
            ans.add(root);
        return ans;
    }
    TreeNode func (TreeNode root , Set<Integer> set){
        
        if(root==null)return null;
        
        boolean is_in_set = false;
        if(set.contains(root.val))
            is_in_set=true;
        
        
        // left 
        
        root.left  = func(root.left,set);
        //right 
        root.right = func(root.right,set);
        
        //root
        if(is_in_set){
            
            if (root.left!=null) ans.add(root.left);
            if (root.right!=null) ans.add(root.right);
            
            return null;
        }
        return root;
        
    }
}