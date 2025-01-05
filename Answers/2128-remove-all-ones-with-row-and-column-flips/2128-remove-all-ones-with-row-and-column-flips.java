class Solution {
    public boolean removeOnes(int[][] grid) {
        //flip all the columns containing 1s
        int rows = grid.length;
        int cols = grid[0].length;
        
        //marker for each flipped columns
        boolean[] flippedCols = new boolean[cols];
        
        for(int c= 0; c < cols; c++){
            
            //flip the column if the cell has 1 and the column has not be flipped before
            if(grid[0][c] == 1 && !flippedCols[c]){
                flippedCols[c] = true;
                for(int i = 0; i < rows; i++){
                    grid[i][c] = (grid[i][c] == 0) ? 1 : 0;
                }
            }
        }
        
        //checking if the following rows have same value in each cell
        //if not break and return false because if all are not same then
        //it is not possible to achieve the target
        for(int r = 1; r < rows; r++){
            for(int c = 0; c < cols-1; c++){
                if(grid[r][c] != grid[r][c+1]){
                    return false;
                }
            }
        }
        return true;
        
        
    }
}
