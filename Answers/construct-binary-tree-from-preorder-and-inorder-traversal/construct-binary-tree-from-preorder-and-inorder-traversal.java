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
        
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i=0;i<inorder.length ; i++){
            map.put(inorder[i],i);
        }
        TreeNode root= buildTree(preorder, 0, preorder.length-1,inorder,0,inorder.length-1);
        return root;
        
    }
   TreeNode buildTree(int[] preorder, int preS,int preE, int[] inorder,int inS,int inE){
        
        if(preE<preS || inE< inS) return null;
        TreeNode root = new TreeNode(preorder[preS]);
        
        int inIdx= map.get(root.val);
        int num = inIdx-inS;
        
        //left 
        
        root.left=buildTree(preorder, preS+1, preS+num,inorder,inS,inIdx-1);
        //right
        
        root.right=buildTree(preorder, preS+num+1, preE,inorder,inIdx+1,inE);
        
        return root;
    }
}