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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;
    
        if(root.val==key)
        {
            //0child -> leaf node 
            
            if(root.left==null && root.right ==null)return root= null;
            
            //2 child only
            
            
           else if(root.left!=null && root.right !=null){
               
                TreeNode left_biggest= find(root.left);
                //basically finding the lefts _rightMost
                root.val=left_biggest.val;
                root.left=deleteNode(root.left,left_biggest.val);
                return root;
            }
            
            // only one child exists
            else if(root.left!=null)return root.left;
            else return root.right;
            
            
        }
        else if(key>root.val) root.right=deleteNode(root.right,key);
        else  root.left=deleteNode(root.left,key);
        
        return root;
    }
    TreeNode find(TreeNode root){
        while(root.right!=null)root=root.right;
        return root;
    }
    
}

/*
1) Deletion of leaf node
2) Deletion of  a node with 1 child
3) Deletion of a node with 2 child -> ambiguity! 

go to lefts right most  or  go to rights left most ! 

after doing this we replace it with the node to be deleted and the node that we have replaced meaning right most in the left subtree it will be the one now eith one chils so we are done ! 


*/