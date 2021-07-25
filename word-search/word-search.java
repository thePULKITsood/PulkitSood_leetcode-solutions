class Solution {
    int n ,m;
    int [][]dir = {{-1,0},{0,-1},{0,1},{1,0}};
    public boolean exist(char[][] board, String word) {
//         for each word make a call and pass the next word as input and mark visited 
        
         n = board.length;
         m = board[0].length;
        boolean vis [][] = new boolean [n][m];
        
        for (int i = 0 ; i< n ; i++){
            for (int j = 0 ; j< m ; j++){
                if(word.charAt(0) == board[i][j] && solve(i,j,board,vis,word,0))
                    return true;
            }
        }
        return false;
    }
   public  boolean solve(int i , int j ,char[][] board,boolean vis [][], String word,int k  ){
        if(k== word.length())
            return true;
        
        if(i<0||j<0 || i>=n || j>=m || board[i][j]!=word.charAt(k) || vis[i][j] == true )
            return false;
        
        
        boolean ans=false;
        vis[i][j] = true;
      
            
            for (int [] d  : dir){
                
                ans=  solve(i+d[0] , j + d[1],board ,vis , word,k+1 );
                
                if (ans)
                    break;
                }
        
            vis[i][j] = false;
            return ans;
        
        
        
        
    }
}