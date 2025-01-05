class Solution {
    public int maxDistance(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<int[]> q=new LinkedList();
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j]==1)
                    q.add(new int []{i ,j});
       }
    }
    if(q.size()==0 || q.size()==m*n) return -1;    
        
        int dis=0;
        int dir[][]={{0,1},{0,-1},{-1,0},{1,0}};
        while (q.size()>0){
            int size =q.size();
            while (size-->0){
                int []t =q.remove();
                
                 //add all the neighbours of t
                for (int d[]:dir){
                    int newi= t[0]+d[0];
                    int newj =t[1]+d[1];
                        
                        if(newi>=0 && newj >=0 && newi <grid.length && newj<grid[0].length && grid[newi][newj]==0)
                        {
                            grid[newi][newj]=1;
                            q.add(new int []{newi ,newj});
                }
                }
                
            }
            // if(q.size()>0)
            dis++;
        }
        return dis-1;
    }
}