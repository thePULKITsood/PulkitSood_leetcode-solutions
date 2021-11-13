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
    class pair {
        int min ;
        int max ;
        int size;
        boolean isBST;
        pair(int mi,int ma,int s, boolean is ){
            min=mi;max=ma;size=s; isBST=is;
        }
    }
    int ans =0;
    public int largestBSTSubtree(TreeNode root) {
        
        func(root);
        
        return ans;
    }
    pair func(TreeNode root){
        
        
        if(root==null)
            return new pair(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        
        pair left = func(root.left);
        pair right = func(root.right);
        
        
            if(left.isBST && right.isBST){
           
                if(root.val>left.max && root.val < right.min){
                    
                     int size = left.size + right.size + 1;
                     ans=Math.max(size,ans);
                    int min = Math.min(left.min,root.val);
                    
                    int max = Math.max(right.max,root.val);
                    
                    return new pair(min,max,size,true);
             }
                
        }
        return new pair(0,0,0,false);
        
        
        
    }
}