class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        
        // first we make a directed graph 
        // then we use thre kahns algorithm to splve this directed graph 
        // .and we run the khans algo from each of hte o indegree vertex and then we return level + 1 which is the size of longest increasing path 
        
//         1. make a indegree matrix 
        int n = matrix.length ;
        int m = matrix[0].length;
        
          int [][]indegree = new int [n][m];
          int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
       
        for (int i = 0 ;i< n ; i++){
       
            for (int j = 0 ;j<m ; j++){
              
                for (int d = 0 ;d<4 ; d++){
                    
                    int x = i +dir[d][0];
                    int y = j + dir[d][1];
                  
                    if (x>=0 && y>=0 && x < n && y< m && matrix[i][j] > matrix[x][y])
                        indegree[i][j]++;
                    
                    }
               }
        }
        
        
//         now we have indegree matrx we can use the kahns algo to find the lingest path using the indegree matrix 
//         as kahns algo gives us the lingest path in the directed acyclic graph 
        
        LinkedList<Integer> q= new LinkedList<>();
//         we start form the indegree == 0 walle 
       
        for(int i = 0; i < n; i++)
         
            for(int j = 0; j < m; j++)
         
                if(indegree[i][j]==0) q.addLast(i*m+j);  
      
        int level = 0 ;
       
        while (q.size()!=0){
            
          
            int size =q.size();
         
            while(size -- >0 )
          
            {
                int rem = q.removeFirst();
                 int i = rem / m;
                 int j = rem % m;
             
             for (int d = 0 ;d<4 ; d++)
             {
                    
                int x = i +dir[d][0];
                int y = j + dir[d][1];
                   
                 if (x>=0 && y>=0 && x < n && y< m && matrix[i][j] < matrix[x][y] )
                 {
                         indegree[x][y]--;
                       
                     if (indegree[x][y]==0)
                            q.addLast(x*m + y);
                    }
                        
            
            }
             
        }
            level ++;

        
    }
        return level;
}
}