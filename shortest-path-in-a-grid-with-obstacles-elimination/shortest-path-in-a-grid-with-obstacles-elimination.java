class Solution {
    class State{
        int row ;
        int col ;
        int dis ;//distance from start
        int rem ;// remaining skips
        State(int row,int col,int dis, int rem){
            this.row=row;
            this.col=col;
            this.dis=dis;
            this.rem=rem;
        }
        
    }
    public int shortestPath(int[][] grid, int k) {
        int n = grid.length;
        int m= grid[0].length;
        int dir [][]= {{0,1},{0,-1},{1,0},{-1,0}};
        if(n+m-2<=k)
            return n+m-2;
        
        Queue<State> q = new LinkedList();
        HashSet<String> visited = new HashSet();
        
        
        q.add(new State(0,0,0,k));
        String s= 0 +"+"+ 0 +"+"+ k;
        visited.add(s);
        while (q.size()!=0){
            
            int size =q.size();
            while (size-- >0){
                
                State temp = q.remove();
                
                if(temp.row==n-1 && temp.col == m-1)
                    return temp.dis;
                
                for (int []d : dir){
                    
                    int x = temp.row +d[0];
                    int y = temp.col+d[1];
                    
                    if(x>=0 && y>=0 && x<n && y<m){
                        
                        int dis = temp.dis +1;
                        int rem = temp.rem;
                        
                        rem-=grid[x][y];
                    
                    String str= x +"+"+ y +"+"+ rem;
                        
                    if(rem >= 0 && !visited.contains(str))
                    {   q.add(new State(x,y,dis,rem));
                        visited.add(str);
                    }
                    
                }
                
            }
                
        }
            // dis++;
       }
        
        // if(ans==Integer.MAX_VALUE) return -1;
        // return ans;
        
        return -1;
        
    }
}
/*

from every point run a bfs and the criteria is x y r -> r being the number of obstacles i can remove still


in the visited arrray or the visited set we will keep the number of remaining skips and the distance from the starting point 

so that when we visit a point and the distance and the remaining skips is samw we skip that because the bfs will be the same again 



*/