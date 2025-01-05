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
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer> mini = new ArrayList();
        
        help (root,targetSum,mini);   
    
        return ans;
        }
    
 void help (TreeNode root, int s ,List<Integer> mini ){
     
     if (root == null) return;
 
    
     if ( s == root.val && root.left==null && root.right==null)
         
     {   mini.add(root.val);
         ans.add(       new ArrayList<Integer>  (mini)    );
         mini.remove(mini.size()-1);
         return;
     }
     
    // pre add post delete after every child and back track 
     mini.add(root.val);
//      call children 
     
     help(root.left , s - root.val , mini);
     help(root.right , s - root.val , mini);
     
     mini.remove(mini.size()-1);
     
 }
    
}