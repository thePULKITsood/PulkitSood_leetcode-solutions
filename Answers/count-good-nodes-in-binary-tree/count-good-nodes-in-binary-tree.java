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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        int count = goodNodes_(root,root.val);
        return count ;
    }


// when we are going in the dfs we will keep a big node and we will check for each value if it is bigger than th ebig node or not 

public int goodNodes_ (TreeNode root , int big){
    
    if (root==null)return 0;
    
    int count =0;
    if (root.val>=big) count ++;
    
    big = Math.max(root.val,big);
    
    int left = goodNodes_(root.left,big);
    int right = goodNodes_(root.right,big);
    count = count +left +right ;
    return count ;


}
}