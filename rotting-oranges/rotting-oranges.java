class Solution {
    public int orangesRotting(int[][] grid) {
      
        LinkedList<Integer> q = new LinkedList<>();
        
        int fresh=0;
        int n = grid.length;
        int m = grid[0].length;
        
        for (int i = 0 ;i< grid.length; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if (grid[i][j] == 2){
                    q.addLast(i*m + j);
                }
                else if (grid[i][j] == 1 ){
                    fresh++;
                }
            } 
        }
        if (fresh==0) return 0;
//         do the bfs 
        int[][] dir = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int time = 0;
        
        while (q.size()!=0){
            int size = q.size();
            
            while (size -- > 0 ){
                int rem = q.removeFirst();
                int  r = rem /m;
                int c = rem%m;
                
                
                for (int d = 0 ; d< dir.length ; d++){
                    
                    int x = r + dir[d][0];
                    int y = c + dir[d][1];
                    
                    if (x >= 0 && y >= 0 &&  x< n &&  y<m  && grid[x][y] == 1){
                        
                        grid[x][y] = 2 ;
                            fresh--;
                        q.add(x *m + y );
                        if (fresh==0)return time +1;
                    } 
                }
              
            }
            time ++;
        }
        return - 1; 
        
    }
}