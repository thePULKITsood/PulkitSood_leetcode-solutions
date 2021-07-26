class Solution {
    int count = 0 ;
    int total = 1;
    
    public int uniquePathsIII(int[][] grid) {
        int x =0;
        int y = 0;
       
        for (int i = 0 ; i< grid.length ; i++){
            for (int j = 0 ; j < grid[0].length ; j++){
                
                if(grid[i][j] == 1 ){
                    x=i;
                    y=j;  
                    
                }
                else if (grid[i][j] == 0)
                    total ++;
            }
            
        }
      dfs(x, y,grid );
    
        return count ;
        
    }
    
void  dfs(int i , int j,int[][] grid ){
    
    if(i<0 || j< 0 || i>= grid.length || j >= grid[0].length || grid[i][j] < 0  ||total<0 )
        return ;
    
    if(grid[i][j] == 2 )
    {   
        if(total == 0)count ++;
        
        return ;
    }
        
    grid[i][j] = -1 ;
    
    total--;
     dfs(i+1, j,grid );
     dfs(i,j+1,grid);
     dfs(i-1,j,grid);
     dfs(i,j-1,grid);
    
    grid[i][j] = 0;
    
    total ++;
    
}
}

// simply if reach the 2 i will add into count and when i back track i will not change the visited array but  when i return false from above meaning i did not reach the end then i will change the visieed array 

