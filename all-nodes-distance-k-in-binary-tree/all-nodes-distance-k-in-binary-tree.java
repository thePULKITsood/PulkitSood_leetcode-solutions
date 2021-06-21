/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        
//           here we have to print k levels down and also to the top and every direction 
//        step 1 -get the node to root path of the  target then 
        
//         step 2 run print k levels down on the nodes in node to root path here what we do is 
//          for each of the nodes we decrease the value of k and print k levels down 
        
//         here we have to be careful with as we must not print all nodes which are at some distance k - i from the nodes in the path 
        // as they are not k distance away from the target so they must be successfully avoided 
        
//          to block we pass a blocker that blocks that call 
    
        
//         function 1 get root to node path 
        
        ArrayList<TreeNode> path = new ArrayList();
        findpath(root,target,path);
        
//         now call a loop for the node to root path and call print down on it 
        List<Integer>  ans = new ArrayList<Integer> ();
        TreeNode blockNode =null;
        
        for (int i  = 0  ; i< path.size() ; i++){
            printkdown (path.get(i),k-i,blockNode,ans);
            blockNode = path.get(i);
        }
        return ans ;
    }
    
    public void printkdown(TreeNode root , int k , TreeNode blockNode , List<Integer> ans ){
//         in this there can be several cases 
        if (k<0 || root == null || root == blockNode  ) return ;
        if (k==0 )
        {
            ans. add(root.val);
            return ;
        }
        printkdown(root.left , k-1 ,blockNode,ans);
        
        printkdown(root.right , k-1 ,blockNode,ans);
        
        
    }
    public boolean findpath(TreeNode root, TreeNode target,ArrayList<TreeNode> path)
    {
        if (root == null) return false;
        
        if (root == target ){
            path.add(root);
            return true;
        }
        
        boolean res = findpath(root.left, target,path) || findpath(root.right, target,path);
        if (res){
            path.add(root);
          
        }
        return res;
//             or works here as it checks both the conditions and our function runs for both if the first one is false and only for first one if it is true 
        
    }
}