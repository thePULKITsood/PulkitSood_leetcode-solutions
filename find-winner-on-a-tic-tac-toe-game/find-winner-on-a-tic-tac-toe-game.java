class Solution {
    public String tictactoe(int[][] moves) {
        int row [] = new int [3];
        int col [] = new int [3];
        int diag [] = new int [2];
        
        int player=1;
        for (int i=0;i<moves.length ; i++){
            if(i%2==0)player =1;
            else player=-1;
            
            int r = moves[i][0];
            int c= moves [i][1];
            row[r]+=player;
            col[c]+=player;
            
            if(r==c)
                diag[0]+=player;
            if(r+c==2)
                diag[1]+=player;
        }
        for (int i:row){
            if(i==3)return"A";
            if(i==-3)return "B";
        }
        
        for (int i:col){
            if(i==3)return"A";
            if(i==-3)return "B";
        }
        
        for (int i:diag){
            if(i==3)return"A";
            if(i==-3)return "B";
        }
        if(moves.length ==9)
            return "Draw";
        return "Pending";
        
    }
}