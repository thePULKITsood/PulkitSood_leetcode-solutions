class Solution {
    public int minKnightMoves(int x, int y) {
       // the offsets in the eight directions
        int[][] dir = {{1, 2}, {2, 1}, {2, -1}, {1, -2},
                {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}}; 
    
        x=Math.abs(x);
        y=Math.abs(y);
        
    boolean[][] visited = new boolean[605][605];
        
        Queue<int[]> q = new LinkedList();
        q.add(new int []{0,0});
        int level=0;
        visited[0][0] = true;
        
        while (q.size()>0){
            int size = q.size();
            
            while (size-->0){
                int []curr = q.remove();
                if (curr[0] == x && curr[1] == y) {
                    return level;
                }
                for (int d[] : dir){
                    
                int []next = new int []{curr[0]+d[0],curr[1]+d[1]};
                    
                    if (!visited[next[0] + 302][next[1] + 302]) 
                    {
                        visited[next[0] + 302][next[1] + 302] = true;
                        q.add(next);
                    }
                   
                }
            }
            level++;
        }
        return level;
        
    
    }
}