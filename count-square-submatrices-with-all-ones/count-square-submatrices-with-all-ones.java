class Solution {
    public int countSquares(int[][] matrix) {
    int r = matrix.length;
        int c = matrix[0].length;
        int ans =0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                // initialising top row and left column 
                
                if(i==0||j==0){
                    ans+=matrix[i][j];
              }
                
                else if(matrix[i][j]==1){
               
                    int left = matrix[i][j-1];
                    int top  = matrix[i-1][j]; 
                    int diag  = matrix[i-1][j-1];
                    
                    int min = Math.min(diag,Math.min(left,top));
                    
                    matrix[i][j]+=min;
                    ans+= matrix[i][j];
                
                }
            }
        }
        return ans;
    }
}
// basically for a cell to be a bottom left corner of a cube 
// the left top and diagonal must also be a part of it 
// basically i will note how many squares is the  onw part of 
/*
[0,1,1,1],
[1,1,2,2],
[0,1,2,3]

*/
