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
    //numebr of nodes  of fully complete binary tree = 2^h - 1 ; 
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        
        int height =1 ;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        while (left!=null && right !=null){
            height ++;
            left=left.left;
            right = right .right;
            
        }
        if(left==null && right ==null){
            // they have same height so we can use the height formulae 
            return (int) Math.pow(2,height)-1;
        }
        //heights not equal -> so we will find the size of left and right and add +1
        return 1+ countNodes(root.left )+countNodes(root.right);
        
    }
}

// {
// if(root==null)return 0;
//         int h =0;
//         Treenode head=root;
//         while (head!=null){
//             h++;
//             head=head.left;
//         }
        
//         int l=0;
//         while (l<h){
//             int mid = l+(h-l)/2;
            
//             int count = find(root,mid);
//             if(count>mid)
//                 l=mid+1;
//             else if (count <mid)
//                 h=mid;
//             else if(count ==mid)
//                 return mid;
//         }
// }