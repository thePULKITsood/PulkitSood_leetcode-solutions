class Solution {
    
    
    private  List<List<String>> solutions = new ArrayList<List<String >>();
    
int size ;
    public List<List<String>> solveNQueens(int n) {
        
 //          as arrays of boolena are initialised as false so 
//          if the array [i ] = false then the space is available  
        
         size= n ; // -- required global variable to be passes so as to make things easier 
        
        boolean [] cols = new boolean [n];
        boolean [] ndiag = new boolean [2 * n - 1 ];
        boolean [] rdiag = new boolean [2 * n - 1 ];
        
//          equaltion for reverdiagnal // row + col  = same diagonal 
//          eq for n diaf = \\ row -col  size - 1 = same diagonal 
            

        
//          approach 
//           1. we will create boolean arrays  - 3 namely  cols ,  normal diag  , reverse diag 
        
//              2. for each place in the  board we will see if all of these allaw we will place the queen and call the                  next row other wise we will skip that coum and look for next posible option 
        
//          making an empty board 
        
        char [][] board  = new char [n][n];
        for (int i = 0 ; i < n; i++)
        {
            for (int j = 0 ;j<n ;j++)
            {
               board [i][j] = '.';
            }
        }
        
        backtrack (0,cols, ndiag  , rdiag , board);
        
        return solutions ;
        
        
    }
    public ArrayList<String >  createBoard ( char[][]board)
    {
        ArrayList<String>  boardnew = new ArrayList<String>();
        for (int i = 0 ; i < board.length ; i++)
        {
            String current_row = new String (board[i]);
//       in the string constructor we can pass a character array and the contents are coppied into the new string 
            boardnew.add(current_row);
        }
        return boardnew;
    }
    
    public void backtrack (int row , boolean[] cols , boolean [] ndiag, boolean [] rdiag , char[][] board )
    {
        if (row == size )
        {
            solutions .add (createBoard(board));
            return ;
        }
        for (int col = 0 ; col < size ; col++)// looping all the columns 
            
        {
//        if i am allowed by checking hte boolean arrays 
            
            if ( cols[col] == false && ndiag [row - col + size - 1 ] == false  && rdiag [row + col ] == false  )
            { 
//                 as we are here we can make a call 
//                  make changes to the arrays 
                
                cols [col] = true ;
                ndiag [row - col + size - 1 ] = true  ;
                rdiag [row + col ] = true;
                
//                  make changes to the board 
                board [row ][col ] = 'Q';
                
                backtrack(row + 1 , cols , ndiag, rdiag, board);
                
//                 backtrack those changes - or undo them 

                board [row][col] = '.';
                
                 cols [col]=false ;
                ndiag [row - col + size - 1 ] = false  ;
                rdiag [row + col ] =false;

            }
        }
        
        
    }
}