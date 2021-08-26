class Solution {
    public int getMaximumGold(int[][] grid) {
        int r = grid.length, c = grid[0].length , max = 0;
        for (int i =0;i<r;i++){
            for (int j = 0 ; j<c;j++){
                if(grid[i][j]!=0){
                    int gold = dfs(grid,i,j,r,c,new boolean[r][c]);
                    max = Math.max(max,gold);
                }
            }
        }
        return max;
        
    }
    int dfs(int [][]grid, int i , int j , int r, int c , boolean[][]visited){
        if(i<0||j<0||i>=r||j>=c || grid[i][j]==0||visited[i][j]==true)
            return 0;
        
        visited[i][j]=true;
        int left = dfs(grid,i+1,j,r,c,visited);
        int right = dfs(grid,i-1,j,r,c,visited);
        int up = dfs(grid,i,j+1,r,c,visited);
        int down = dfs(grid,i,j-1,r,c,visited);
        visited[i][j]=false;
        return Math.max(left,Math.max(right,Math.max(up,down)))+grid[i][j];
    }
}
// run a dfs from each cell and return the maximum amount as they have said we have only 
//25 cells so we can run a dfs the complexity will be at max 25 * 25 

// as in worst case for each of the cell we visit all the cells 