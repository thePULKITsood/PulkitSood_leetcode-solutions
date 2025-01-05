class Solution {
    public int islandPerimeter(int[][] grid) {
        
//          count * 4 - neighbours = perimetr 
//         we calculate neighbour as  for 2 cells we have 2 neighbours - 1 cell
        // has 1 neighbour and other has 1 neighbour so 2 nbrs
        
//         loop and if it is a cell count ++ 
        // and then check for neighbours on all the sides 
        
        // and then apply formulae 
        
         int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

        int countOnes = 0;
        int CountNbrs =0;
        
        for(int i = 0; i < grid.length;i++){
            
            for(int j = 0; j < grid[0].length; j++){
                
            if (grid[i][j] ==1 )   
            {
                countOnes ++ ;
                // now check neighbours 
                
                    for  (int d = 0 ;d<dir.length ; d++ )
                  {
                        int r = i + dir[d][0];
                         int c = j + dir [d][1];
                    
                    
                         if( r>=0 && c>=0 && r<grid.length && c< grid[0].length && grid[r][c] == 1) 
                              CountNbrs++;
                     }
                
                }
            }
        }
         return 4 * countOnes - CountNbrs;
        
        
    }
}