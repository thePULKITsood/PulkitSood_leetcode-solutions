class Solution {
    public void solveSudoku(char[][] board) {
        
//          i will write two functions 
//         1 . is safe place 
//          2 backtrack 
//          keep in mind to make a boolean functin and treturn true when we hit the base case 
//         as other wise we will fully backtrack and as we return the solution in base case 
//         as there is nothing to retur our changes will all revert back         
        backtrack(board,0,0);
        
    }
    public boolean backtrack (char[][]board , int i , int j )
    {
        if (i==board.length) return true; // meanign we are out of bounds bro 
        
        int ni = 0;
        int nj = 0 ;
        
        if (j== board[0].length - 1 ) // changing the i to next row and j to column zero
        {
            ni = i+1 ;
            nj = 0;
        }
        
        else 
        {
            ni= i;
            nj = j+ 1 ;
        }
        
        
        boolean ans=false;
        
        if (board[i][j]!= '.')
           return  backtrack(board,ni,nj);
        
        else{ 
//             there isspace available and we have to place words 
        for (char po = '1'; po<='9';po++)
        {
            if (isvalid(i,j,po,board))
            {
                board[i][j] = po;
                ans = backtrack(board,ni,nj);
                
                if (ans==false)
                board[i][j] ='.';
                else break;
//                  only back track then as this will not allow us to change the board 
//                 and every thing wll become .again 
                
            }
        }
            return ans;
            
        }
    }
    public boolean isvalid(int row, int col , char val,char[][]board )
    {
//          check row 
        
        for (int j=0;j<9;j++)
        {
            if (board[row][j] == val)
                return false;
        }
//         checking col
        
        for (int i=0;i<9;i++)
        {
            if( board[i][col] == val)
                return false ;
        }
//          checking submatrix 
        int subi = row/3 * 3;
        int subj = col/3 * 3 ;
        
        for (int i = subi ;i <subi+3;i++)
        {
            for (int j = subj ; j<subj+3;j++)
            {
                if (board[i][j]== val)
                    return false;
            }
        }
        return true;
        
    }
}






















