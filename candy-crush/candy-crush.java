// class Solution {
//     int B[][];
//     boolean visited[][];
//     int n,m;
//     public int[][] candyCrush(int[][] board) {
//         B=board;
//          n =B.length;
//          m = B[0].length;
//         boolean found =true;
//         while(found){
//        visited = new boolean[n][m];
            
//         found = flagrow();
//         found= flagcolumn();
//         removeflag();
//         gravity();
//         }
//         return B;
        
//     }
//     boolean flagrow(){
//         boolean flag = false;
        
//         for(int i=0;i<n ;i++){
            
//             for (int j=1;j<m-1;j++){
//                 if(B[i][j]!=0 && B[i][j]==B[i][j-1] && B[i][j]==B[i][j+1])
//                 {
//                     flag=true;
//                     visited[i][j]=visited[i][j+1]=visited[i][j-1]=true;
//                 }
                    
//             }
//         }
//         return flag;
//     }
//     boolean flagcolumn(){
//        boolean flag = false;
      
//         for(int j=0;j<m ;j++){
            
//             for (int i=1;i<n-1;i++){
//                 if(B[i][j]!=0 &&B[i][j]==B[i+1][j] && B[i][j]==B[i-1][j])
//                 {
//                     flag=true;
//                     visited[i][j]=visited[i+1][j]= visited[i-1][j]=true;
//                 }
//            }
//         }
//         return flag;
//     }
//     void removeflag(){
//         for (int i=0;i<n;i++){
//             for (int j=0;j<m;j++){
//                 if (visited[i][j]==true)
//                     B[i][j]=0;
                
//             }
//         }
//     }
//    void gravity(){
//         for (int j=0;j<m;j++){
//             for (int i=n-1;i>=0;i--){
//                 if(B[i][j]==0)continue;
//                 int k=i;
//                 while (k <n-1){
//                     if(B[k+1][j]==0)
//                     {    B[k+1][j]=B[k][j];
//                          B[k][j]=0;
//                          k++;
//                     }
//                 }
//             }
//         }
//     }
    
    
// }
class Solution {
    public int[][] candyCrush(int[][] board) {
        int R = board.length, C = board[0].length;
        boolean todo = false;
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c + 2 < C; ++c) {
                int v = Math.abs(board[r][c]);
                if (v != 0 && v == Math.abs(board[r][c+1]) && v == Math.abs(board[r][c+2])) {
                    board[r][c] = board[r][c+1] = board[r][c+2] = -v;
                    todo = true;
                }
            }
        }
        for (int r = 0; r + 2 < R; ++r) {
            for (int c = 0; c < C; ++c) {
                int v = Math.abs(board[r][c]);
                if (v != 0 && v == Math.abs(board[r+1][c]) && v == Math.abs(board[r+2][c])) {
                    board[r][c] = board[r+1][c] = board[r+2][c] = -v;
                    todo = true;
                }
            }
        }

        for (int c = 0; c < C; ++c) {
            int wr = R - 1;
            for (int r = R-1; r >= 0; --r)
                if (board[r][c] > 0)
                    board[wr--][c] = board[r][c];
            while (wr >= 0)
                board[wr--][c] = 0;
        }

        return todo ? candyCrush(board) : board;
    }
}