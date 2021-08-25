class Solution {
    public boolean hasPath(int[][] maze, int[] s, int[] d) {
        int r = maze.length;
        int c = maze[0].length;
        
        Queue<int[]> q = new LinkedList();
        boolean visited[][] = new boolean[r][c];
        
        q.add(s);
        visited[s[0]][s[1]]= true;
        
        int direc [][] = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while (!q.isEmpty()){
            int size = q.size();
            
            while (size-->0){
                
                int []curr = q.remove();
                if(curr[0]==d[0] && curr[1]==d[1])return true;
                
                    
                for (int dir []: direc){
                    int nr = curr[0];
                    int nc = curr[1];
                    while (nr>=0 && nc>=0 && nr<r &&nc<c && maze[nr][nc]==0){
                        nr+=dir[0];
                        nc+=dir[1];
                    }
                        nr-=dir[0];
                        nc-=dir[1];
                    
                    if(visited[nr][nc]==false){
                        q.add(new int []{nr,nc});
                        visited[nr][nc]=true;
                    }
                    
                }
                // add all the 4 konas where the ball can reach 
                
                //left 
                
                
                //right 
                
                
                //down
                
                
                //top
                
                //add then and mark them visited ;
                
                
            }
        }
        return false;
    }
}