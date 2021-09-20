class Solution {
    
    int par [];
    int rank [];
    int count = 0;
    
    public int numIslands(char[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        
        
        par = new int [n*m];
        rank = new int [n*m];
        Arrays.fill(rank,1);
        
        int[][] distance = {{1,0},{-1,0},{0,1},{0,-1}};
        
        
//         filling the parent array 
        
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++){
            if (grid[i][j] == '1') {
                 int id = i * m + j;
                    par[id] = id;
                        count++;
                    }
            else 
             par[i * m + j] =-1;
            
            
                }  
            }  
        
        
//         now calling union 
         
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++){
            if (grid[i][j] == '1') {
                    grid[i][j]='0';
                   
                for (int[] d : distance) 
                    {
                        int x = i + d[0];
                        int y = j + d[1];
                        
                        if (x >= 0 && x < n && y >= 0 && y < m && grid[x][y] == '1')
                        {
                            int id1 = i*m + j;
                            int id2 = x*m + y;
                            
                            union(id1,id2);
                            
                            // grid[x][y] ='0';
                            
//                             ye yahan pe nahi karna tha ye upar karna tha bss neeche karne se error islia aa rha that dry run karke pata laga 
                            
                        }
                    }
                    
                }
            }
        }
        return count ;
    }
//     find function -> here i have applied the path compressoin 
    
    public int findPar ( int u )
    {
        if (par[u] == u)  return u;
        return  par[u] = findPar(par[u]);
         
    }
    public void union (int a, int b ){
        int p1 = findPar(a);
        int p2 = findPar(b);
        if (p1!=p2){
            
            par[p2] = p1;
            
            
            
            
            
            count --;
//             here we are using the ulta count as we will return count 
//             first we count total numb of 1s then we keep decreasing count when we do union of ones 
//            as one is becoming merged with other 
        }
    }
}