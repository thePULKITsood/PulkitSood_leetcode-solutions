class Solution {
    public int swimInWater(int[][] grid) {
        //bfs with priority Queue
        int n=grid.length,m=grid[0].length;
        
        boolean vis [][] = new boolean [n][m];
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.add(new int []{0,0,grid[0][0]});
        int dir [][]={{0,1},{0,-1},{1,0},{-1,0}};
        
        while (!pq.isEmpty())
        {
            int cur [] = pq.remove();
            int x=cur[0];
            int y =cur[1];
            int val = cur[2];
            
            vis[x][y]=true;
            if(x==n-1 && y==m-1)
                return Math.max(val,grid[x][y]);
                
            for (int d[] : dir){
                int nx = x+d[0];
                int ny = y+d[1];
                
                
                if( nx>=0 && ny>=0 && nx<n && ny<m  && !vis[nx][ny]){
                    
                    pq.add(new int []{nx,ny,Math.max(grid[nx][ny],val)});
                
                }
            }
        }
        return -1;
    }
}