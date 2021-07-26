class Solution {
    
        ArrayList<String> ans = new ArrayList();
       int n ,m;
    
    public class Node
    {  Node[] child = new Node [26];
        String str;
     
    }
    
      public void  insert(Node curr , String s ){
            for (int i = 0 ; i < s.length() ; i++){
                char ch = s.charAt(i);
                
                if(curr.child[ch-'a'] == null)
                    curr.child[ch-'a'] = new Node();
               
                curr = curr.child[ch-'a'];
            }
          curr.str=s;
        }
        
    public List<String> findWords(char[][] board, String[] words) {
        
         n = board.length;
         m = board[0].length;
        
        Node root = new Node ();
        for (String s : words){
            insert(root,s);  
        }
        
        boolean [][]visited = new boolean [n][m];
        
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j< m ; j++){
                backtrack(i,j,board,root,visited);
            }
        }
        
        return ans;
    }
        
        
       void  backtrack(int i  , int j , char[][]board, Node root,boolean [][]visited){
           if( i<0 || j<0 || i>=n || j>=m || visited[i][j] == true ) return ;
           
            char ch = board[i][j];
            
            if(root.child[ch-'a'] == null) // means  does not exist return 
                return; 
            
                Node son = root.child[ch-'a'];
           
            if(son.str != null){
                ans.add(son.str);
                son.str=null;
            }
            
        // call the four directions 
           visited[i][j] = true;
           
               backtrack(i+1,j,board,son,visited);
               backtrack(i-1,j,board,son,visited);
               backtrack(i,j+1,board,son,visited);
               backtrack(i,j-1,board,son,visited);
                
           visited[i][j] = false; 
        }
        
    }
