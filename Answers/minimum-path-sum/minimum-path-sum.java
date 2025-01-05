class Solution {
    public int minPathSum(int[][] g) {
        
        int n  = g.length;
        int m = g[0].length;
        
        for (int i = n-1; i>=0;i--){
            for (int j = m-1 ; j>=0 ; j--){
                
                if(i==n-1 && j == m-1 )
                continue;
                    
                else if (i==n-1)
                        g[i][j]+=g[i][j+1];
                
                else if (j==m-1)
                    g[i][j] +=g[i+1][j];
                
                else 
                    g[i][j] +=Math.min(g[i][j+1],g[i+1][j]);
                
            }
        }
        return g[0][0];
    }
}