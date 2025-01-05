class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        
//         binary search 
        
        int l = 0 ; 
        int r = n*m -1 ;
        
        while (l<=r){
            int mid = (l+r) /2 ;
            int row = mid/m;
            int col = mid%m;
            
            int ele = matrix [row][col];
            if( target == ele)
                return true;
            
            else if (target> ele)
                l=mid+1;
            
            else 
                r=mid-1; 
            
                
        }
        return false;
    }
}