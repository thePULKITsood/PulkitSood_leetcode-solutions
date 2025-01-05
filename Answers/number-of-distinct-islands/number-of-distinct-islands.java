class Solution {
//     int G[][];
    
//     boolean visited[][];
    
    StringBuilder sb ;
    int n,m;
    
    public int numDistinctIslands(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        // this.G=grid;
        
        // visited=new boolean[n][m];
        
        Set<String> set = new HashSet();
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j]==1){
                
                sb = new StringBuilder();
                dfs(i,j,'0',grid);
                
                // if(sb.length()==0) continue;
                    
                set.add(sb.toString());
                
                }
            }
        }
        return set.size();
        
    }
    void dfs(int i,int j, char c,int grid[][]){
        
        if(i<0 || j< 0 ||i>=n || j>=m || grid[i][j]==0 )return;
        
        // if(visited[i][j] || G[i][j]==0)return ;
        
        // visited[i][j]=true;
        grid[i][j]=0;
        
        sb.append(c);
        
        dfs(i+1,j,'D',grid);
        dfs(i-1,j,'U',grid);
        dfs(i,j+1,'R',grid);
        dfs(i,j-1,'L',grid);
        sb.append('0');
    }
}