/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        
        StringBuilder sb =  new StringBuilder();
        preorder(root,sb);
        
        return sb.toString().trim();
        
    }
  public void preorder(TreeNode root,StringBuilder sb){
        if(root==null)return ;
        //root
        sb.append(root.val + " ");
        
        //left
        preorder(root.left,sb);
        //right
        preorder(root.right,sb);
      
    }

    // Decodes your encoded data to tree.
    
    public TreeNode deserialize(String data) {
        
        if (data.isEmpty()) return null;
        
     
        String arr []=data.split(" ");
        
      
        return makeTree(arr,0,arr.length-1);
        
        
    }
    TreeNode makeTree( String []arr, int low , int high){
        
        if(low > high)return null;
        
        TreeNode root = new TreeNode (Integer.parseInt(arr[low]));
       int i;
        for ( i=low;i<=high;i++){
        
            if(Integer.parseInt(arr[i])>root.val){
             break;   
            }
        }
            
            
        root.left = makeTree(arr,low+1,i-1);
        root.right = makeTree(arr,i,high);
        
        return root;
        
    }
   
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;