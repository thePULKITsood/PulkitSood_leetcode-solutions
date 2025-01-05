class Solution {
    public int[][] generateMatrix(int n) {
        
        int [][] ans = new int [n][n];
        if (n==0)return ans;
        
        int left = 0 , right = n-1 ;
        int top = 0 , down = n-1 ;
        
        int total = n*n;
        int count = 1 ;
        
        while (count <=total )
        {
//          first left to right and in the top row 
            for (int j  = left ;j<=right  && count <=total ;j++)
            {
                ans[top][j]=count;
                count ++;
            }
            top ++;
//    now as we have filled top row and the next one will be from top to bottom 
//    thus we have to do top -- as this will make sure we do not repeat th e same space 
//    and as we have already filled all the boxes in  top row so we must make top --
        
//     2nd is the right wall we go form top to down in the right column 
            for( int i = top ; i<= down && count <=total ; i++)
            {
                ans [i][right] = count ;
                count ++;
            }
            right --;
//             we do right -- as next is from right to left ansd we do not want o over lap and 
//              as we have completed the full right row we must do this and shift to the next right row 
            for (int j = right ; j>=left &&  count <=total ;j--)
            {
                ans [down][j]= count ;
                count ++;
            }
            down --;
//             now we will ove the down up as we are down with the last row 
//             4ht going from down to top 
            for (int i=down ; i>=top && count <=total ; i--)
            {
                ans [i][left] = count ;
                count ++;
            }
            left ++;}
        return ans ;
        
    }
}