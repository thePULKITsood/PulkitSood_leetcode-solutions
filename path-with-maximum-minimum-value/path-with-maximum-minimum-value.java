class Solution {
     int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    
    public int maximumMinimumPath(int[][] grid) {
        int n = grid.length;
        int m  = grid[0].length;
        
        
        //int [] -> val , row ,col 
        // and it is a max priority queue
        
        PriorityQueue<int []> pq = new PriorityQueue <>((a,b)-> b[0]-a[0]);
        
        pq.add(new int []{grid[0][0] , 0,0});
        boolean vis [][] = new boolean[n][m];
        
        while (!pq.isEmpty()){
            int [] curr = pq.remove();
            int val = curr[0];
            int x = curr[1];
            int y = curr[2];
            if(x==n-1 && y==m-1)return val;
            
            vis[x][y]=true;
            
            for (int d[]:dir){
                int nx = x+d[0];
                int ny = y+d[1];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m && !vis[nx][ny]){
                    int min = Math.min(grid[nx][ny] , val);
                    pq.add(new int []{min,nx,ny});
                }
            }
            
        }
        return -1;
    }
}