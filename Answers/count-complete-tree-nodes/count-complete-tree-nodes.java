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
        
        int heightleft =1 ;
        int heightright =1 ;
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        while (left!=null){
            heightleft++;
            left=left.left;
        }
        
        while (right!=null){
            heightright++;
            right=right.right;
        }
        
        if(heightleft==heightright){
            
          // they have same height so we can use the height formulae 
         //this is a complete binary tree ! 
            
            return (int) Math.pow(2,heightleft)-1;
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