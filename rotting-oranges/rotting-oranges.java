class Solution {
    public int orangesRotting(int[][] grid) {
      
        Queue<Integer> q = new LinkedList<>();
        
        int fresh=0;
        int n = grid.length;
        int m = grid[0].length; // cols 
        
        for (int i = 0 ;i< grid.length; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                
                if (grid[i][j] == 2){
                    
                    q.add(i*m + j); // index = row * col + col 
                }
                else if (grid[i][j] == 1 ){
                    fresh++;  // to check the ending condition 
                }
            } 
        }
        
        if (fresh==0) return 0; // all are rotten 
        
//         do the bfs 
        int[][] dir = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        
        int time = 0;
        
        while (q.size()!=0){
            int size = q.size();
            
            while (size -- > 0 ){
                
                int rem = q.remove();
                
                int  r = rem /m;  // -> row == rem / cols  -> divident   
                int c = rem%m; //-> col == rem / cols -> remainder 
                
                
                
                for (int d = 0 ; d< dir.length ; d++){
                    
                    int x = r + dir[d][0];
                    int y = c + dir[d][1];
                    
                    if (x >= 0 && y >= 0 &&  x< n &&  y<m  && grid[x][y] == 1){ // is valid 
                        
                        grid[x][y] = 2 ;//make it polluted ! 
                        
                        
                        fresh--;
                        
                        q.add(x *m + y );
                        
                        if (fresh==0)return time +1; // return time +1 as we started with time as 0 ! 
                    } 
                }
              
            }
            time ++;
        }
        return - 1; 
        
    }
}