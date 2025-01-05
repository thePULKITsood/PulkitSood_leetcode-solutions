class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        // Variables to track the size of the matrix
        int N = matrix.length;
        int M = matrix[0].length;
        
        int[] result = new int[N*M];
        int k = 0;
        
        ArrayList<Integer> intermediate = new ArrayList<Integer>();
        
         for (int d = 0; d < N + M - 1; d++) {
              intermediate.clear();
             
             //if(d<M )-> meaning first row and columns are changing 
             
             // if (d>m meaning the rows are changing and the column is the last one )
             int row = d<M ?0 : d-M+1;
             int col = d<M ? d :M-1 ;
             
             while (row < N && col >-1){
                 intermediate.add(matrix[row][col]);
                 row++;
                 col--;
             }
             if(d%2==0)
                 Collections.reverse(intermediate);
             
             for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
         }
        return result;
    }
}