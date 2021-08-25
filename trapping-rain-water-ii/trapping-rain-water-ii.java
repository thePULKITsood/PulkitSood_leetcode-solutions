class Solution {
    public int trapRainWater(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        //arr == height row col 
        
        PriorityQueue<int []> heap = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        boolean [][] vis = new boolean[r][c];
        
        
        for (int i = 0 ; i<r;i++){
            
            for (int j=0;j<c ; j++){
                
                if(i==0|| i==r-1 || j==0 || j==c-1){
                            int val = grid[i][j];
                        heap.add(new int [] {val,i,j});
                        vis[i][j]=true;
                }
            }
        }
       
        int vol = 0;
        int minbound=0;
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        while (heap.size()>0){
            int current=heap.peek()[0];
            int row = heap.peek()[1];
            int col =heap.peek()[2];
            minbound = Math.max(minbound,current);
            heap.remove();
            
            for (int d[] : dir){
                int rr=row+d[0];
                int cc = col + d[1];
                
                if(rr>=0 && cc>=0 && rr<r && cc<c && !vis[rr][cc]){
                    
                        int val = grid[rr][cc];
                        heap.add(new int [] {val,rr,cc});
                        vis[rr][cc]=true;
                    
                    if(val<minbound)
                    {
                        vol+=minbound-val;
                    }                
                }
                
            }
            
            
        }
        
        
        
        
        return vol;
        
    }
}