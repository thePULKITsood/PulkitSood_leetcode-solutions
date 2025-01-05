class Solution {
    public void solve(char[][] board) {
        if (board.length==0)return;
        
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        
        int n = board . length ;
        int m = board[0].length;
        
        for (int i = 0 ; i<n;i++){
            
            if (board[i][0] =='O') dfs(i,0,n,m,board,dir);
            if (board[i][m-1] =='O')dfs(i,m-1,n,m,board,dir);
            
            }
        
        for (int j = 0 ; j < m ; j++){
            
            if (board[0][j]=='O')dfs(0,j,n,m,board,dir);
            if (board[n-1][j]=='O')dfs(n-1,j,n,m,board,dir);
            
        }
        
      for(int i = 0; i <n;i++){
          
            for(int j = 0; j < m; j++){
                
                if(board[i][j] == 'O') board[i][j] = 'X';
                else if(board[i][j] == 'E') board[i][j] = 'O';
            }
        }
        
    }
   public  void dfs  (int i , int j , int n , int m , char[][]board,int [][]dir) 
    {
//         now if i came here it means i must be a O on th eboundry run a dfs and make all the O ==E 
            board[i][j] = 'E';
         
       for (int d= 0 ; d<dir.length;d++)
            {
                int r = i + dir[d][0];
                 int  c = j + dir [d][1];
        
             if (r >=0  && c>=0 && r< n && c < m && board[r][c]=='O' ){
                 dfs(r,c,n,m,board,dir);
            }
         }
    }
}