/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int rows = binaryMatrix.dimensions().get(0);
        int cols = binaryMatrix.dimensions().get(1);
        
          // Set pointers to the top-right corner.
        int i = 0;
        int j = cols - 1;
        while (i<rows && j>=0){
           
            if (binaryMatrix.get(i, j) == 0) {
                i++;
            } else {
                j--; 
            }  
        }
            
        // If we never left the last column, this is because it was all 0's.
        return (j == cols - 1) ? -1 : j + 1;
        
        
    }
}