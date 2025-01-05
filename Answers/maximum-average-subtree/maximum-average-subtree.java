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
        double sum;
        double maxavg;
        int num;
        pair(double sum , double maxavg,int num){
            this.sum=sum;
            this.maxavg=maxavg;
            this.num=num;
        }
    }
    public double maximumAverageSubtree(TreeNode root) {
        pair p=func(root);
        return p.maxavg;
        
    }
   pair func(TreeNode root){
        if(root==null)
        {
            return new pair(0,0,0);
        }
        pair left = func(root.left);
        pair right = func(root.right);
        
        int num = left.num+right.num +1 ;
        double sum = left.sum+right.sum + root.val;
        double myavg = sum/num;
        
        myavg = Math.max(myavg, Math.max(left.maxavg , right.maxavg));
        return new pair(sum,myavg,num);
        
    }
}

// //  1. return the sum till now 
//     2. the number of roots till now 
//     3. my average 
    
//     for a node it gets 6 things 
//     1. calc my average  = sum left + sum right + me / numright +numleft+1
//     2. return sum
//     3.return num
//     4.return max (my avg , left avg , right avg)