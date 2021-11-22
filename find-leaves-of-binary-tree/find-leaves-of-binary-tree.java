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
    // add all leaves  + 
    // remove all leaves 
    
    // repeat until the  node ==null
    List<List<Integer>> ans =new ArrayList();
    
    List<Integer> minians =new ArrayList();
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        while (root!=null){
            minians=new ArrayList();
            root = add_remove_leaves(root);
            ans.add(minians);
        }
        return ans;
    }
   TreeNode  add_remove_leaves (TreeNode root){
        
        if(root==null)return null;
        //root -> //left //right 
        
        if(root.left==null && root.right==null){
            minians.add(root.val);
            return null;   
        }
       root.left = add_remove_leaves(root.left);
       root.right = add_remove_leaves(root.right);
       
       return root;
    }
}