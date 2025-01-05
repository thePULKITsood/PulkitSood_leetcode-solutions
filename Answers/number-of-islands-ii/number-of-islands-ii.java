class Solution {
     int[] par;
    
    int findPar(int u ){
        if(par[u] == u) return u;
        return par[u] = findPar(par[u]);
    }
    
    public List<Integer> numIslands2(int n, int m, int[][] positions) {
        
        
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        
        par = new int[n*m];
        for(int i=0;i<n*m;i++) par[i] = i;
        
        int count = 0;
        List<Integer> ans = new ArrayList<>();
            
        int[][] grid = new int[n][m];
        
        for(int[] p : positions){
            
            int i = p[0];
            int j = p[1];
            if(grid[i][j] == 0){
            
            grid[i][j] = 1;
            count++;
            
                //count ++ 
                
                // now to reduce the count connect it with all the 4 components which are on its side 
                // find the parent 
                
            int p1 = findPar(i*m+j);
            //for all the 4 points 
                
            for(int d[]:dir){
                
                int r = i +d[0];
                int c = j + d[1];
                
                if(r >= 0 && c >= 0 && r < n && c < m && grid[r][c] == 1){
                
                    int p2 = findPar(r*m+c);
                    // if the parents are not same meaning we must merge them  ! 
                    // if their parents are same meaning this was already merged -- or it does not have any neighbouring element -> so that case will not arise 
                   
                    if(p1!=p2){
                        count--;
                        par[p2] = p1;
                    }
                }
              }
            }
            ans.add(count);
        }
        
        return ans;
        
    }
}