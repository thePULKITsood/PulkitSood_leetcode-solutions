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
    public List<TreeNode> generateTrees(int n) {
        if (n==0)
            return new ArrayList<TreeNode>();
        return helper(1,n);
        
    }
    List<TreeNode> helper(int start,int end){
        List<TreeNode> anslist = new ArrayList();
        
        if(start>end){
            anslist.add(null);
            return anslist;
        }
        if(start==end){
            anslist.add(new TreeNode(start));
            return anslist;
        }
        
        for (int i=start ;i<=end;i++){
            List<TreeNode> leftnodes = helper(start,i-1);
            List<TreeNode> rightnodes=helper(i+1,end);
            
            for (TreeNode l:leftnodes){
                for(TreeNode r : rightnodes){
                    TreeNode current = new TreeNode(i);
                    current.left=l;
                    current.right=r;
                    anslist.add(current);
                }
            }
            
        }
        return anslist;
        
    }
}