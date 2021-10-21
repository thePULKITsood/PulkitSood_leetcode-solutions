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
    Map<Integer,Integer> map = new HashMap();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        for (int i=0;i<len ; i++){
            map.put(inorder[i],i);
        }
        
        TreeNode root = buildTree(inorder,postorder,0,len-1,0,len-1);
        return root;
        // inorder  -> left  root right 
        // post Order -> left -> right -> root
    } 
    TreeNode buildTree(int[] inorder, int[] postorder,int inS,int inE, int postS , int postE){
        
        if(postS>postE || inS>inE)return null;
        TreeNode root = new TreeNode (postorder[postE]);
        
        int inIdx = map.get(root.val);
        int num=inIdx-inS;
        
        root.left =buildTree(inorder,postorder,inS,inIdx-1, postS,postS+num-1);
        
        root.right =buildTree(inorder,postorder,inIdx+1,inE,postS+num,postE-1 );
        return root;
    }
}