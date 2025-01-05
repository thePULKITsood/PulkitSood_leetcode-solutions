class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 ) return ans;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int left = 0, right = col-1;
        int top = 0 , bottom = row-1;
        
        int total  = row *col;
        int count = 0 ;
        while (count < total )
            
        {
            for (int j = left ; j<=right &&count < total ; j++ )
            {
                ans.add(matrix[top][j]);
                 count ++;
            }
            
            top ++; // next time in this loop we will traerse the  next row 
            
            
            for (int i = top ; i <= bottom &&count < total ; i++ )
            {
                ans.add(matrix[i][right]);
            count ++;
            }
            
            right --; // we change right as we have already visited the prev right in the last loop now
//              we have to make it minus so that we dont repeat stuff 
            
            
            
            for (int j= right ; j>=left  &&count < total ;j--)
            {
                ans.add(matrix[bottom][j]);
                count ++;
               }
            bottom--;
            
            for (int i=bottom ; i>=top  &&count < total; i--)
            {
                ans.add(matrix[i][left]);
                    count ++;            
            }
            
            left++;
        
    }
        return ans ;
}
}