public class Codec {

//     using preorder traversal - for both serialisatoin and decerialisatoin 
    
//    Encodes a tree to a single string.
    
    public String serialize(TreeNode root) {
        
        StringBuilder sb = new StringBuilder ();
        serialize_ ( root ,  sb);
        return sb.toString();
        
    }
   private void serialize_ (TreeNode root , StringBuilder sb ){
       
       if (root == null){
           sb.append("null," );
            
       }
       else 
       {
       sb.append(root.val + ",");
       serialize_(root.left,sb);
       serialize_(root.right,sb);
       }
   }

     static int index=0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        String [] arr =  data.split(",");
        index = 0;
        // al the difficuty was because of the static i need to make it 0 every time 
        
    
        TreeNode ans = deserialize_(arr);
        return ans;
    }
    
    
    private TreeNode deserialize_ (String[] arr ){
        
        if (index >= arr.length || arr[index] .equals("null")){
            
              index++;
            return null;
        }
        
        TreeNode node = new TreeNode (Integer.parseInt(arr [index++] ) );
        
        node.left = deserialize_(arr);
        
        node.right = deserialize_(arr);
        
        return node;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));