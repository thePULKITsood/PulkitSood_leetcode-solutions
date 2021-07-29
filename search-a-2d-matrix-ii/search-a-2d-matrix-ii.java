class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        
        int row = 0;
        int col = m-1;
        
        while (col >=0 && row <= n-1 ){
            int ele = matrix[row][col];
            if(ele == target)
                return true;
            else if (ele > target) // discard the coumn
                col -- ;
            else                  // discard the row 
                row ++ ;
            
        }
        return false;
        
    }
}
// basically apply binary search on diagonals 
// pick up the top right element and from that do a binary search and keep changing the row and column indexes 