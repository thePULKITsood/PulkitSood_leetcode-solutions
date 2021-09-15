class Solution {
    int n;
    public int cherryPickup(int[][] grid) {
         n = grid.length;
        int [][][][] dp = new int [n][n][n][n];
        int ans = func(0,0,0,0,grid,dp);
        if(ans<0)return 0;
        return ans;
    }
    int func (int r1,int c1,int r2,int c2,int[][]grid,int[][][][]dp){
        if(r1>=n || r2>=n || c1>=n || c2>=n || grid[r1][c1]==-1 || grid[r2][c2]==-1)
            // return 0;
            return  Integer.MIN_VALUE;
        
        if(dp[r1][c1][r2][c2]!=0)return dp[r1][c1][r2][c2];
        int cherries = 0;
        
        if(r1==n-1 && c1==n-1) return grid[r1][c1];
        
        if(r1==r2 && c1 ==c2 )
            cherries+=grid[r1][c1];
        
        else 
            cherries += grid[r1][c1]+grid[r2][c2];
        
        int f1 = func(r1,c1+1,r2,c2+1,grid,dp);
        int f2 = func(r1,c1+1,r2+1,c2,grid,dp);
        int f3 = func(r1+1,c1,r2,c2+1,grid,dp);
        int f4 = func(r1+1,c1,r2+1,c2,grid,dp);
        
        cherries += Math.max(Math.max (f1,f2),Math.max(f3,f4));
        
        return dp[r1][c1][r2][c2]=cherries;
    }
}
 // [[1,1,-1],
 //  [1,-1,1],
 //  [-1,1,1]]