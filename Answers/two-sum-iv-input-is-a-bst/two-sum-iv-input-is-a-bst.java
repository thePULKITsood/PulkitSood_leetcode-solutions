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
    ArrayList<Integer> list = new ArrayList();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        int l=0;
        int r=list.size()-1;
        while(l<r){
            int sum = list.get(l)+list.get(r);
            if(sum>k)
                r--;
            else if(sum<k)
                l++;
            else return true;
        }
        return false;
    }
  void  inorder( TreeNode root){
        if(root==null)return;
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        
    }
}
//inorder traversal + binary search 