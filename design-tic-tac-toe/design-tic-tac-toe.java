class TicTacToe {
    int n;
    int rows[];
    int cols[];
    int diag[]=new int[2];
    int p;
    /** Initialize your data structure here. */
    public TicTacToe(int num) {
        n=num;
        rows=new int [n];
        cols = new int [n];
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.  ->    1 
                2: Player 2 wins.   ->  -1
                */
    public int move(int row, int col, int player) {
        if (player==1)p=1;
        else p=-1;
        
        rows[row]+=p;
        cols[col]+=p;
        if(row==col)
            diag[0]+=p;
        if(row+col == n-1)
            diag[1]+=p;
        
        
        for (int i:rows){
            if(i==n)return 1;
            if(i==-n)return 2;
        }
        for (int i:cols){
            if(i==n)return 1;
            if(i==-n)return 2;
        }
        for (int i:diag){
            if(i==n)return 1;
            if(i==-n)return 2;
        }
        
        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */