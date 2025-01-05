class Solution {
    public int numTrees(int n) {
        int dp [] = new int [n+1];
        dp[0] =1 ;
        dp[1] = 1;
        
        
        //i == number of total nodes 
        //j==the root node of the tree 
        
        for (int nodes = 2 ;nodes<=n ; nodes++){
            
         // we are starting from 2 
            for (int root=1;root <=nodes ; root++){
                
                int left = root-1;
                int right = nodes - root;
                dp[nodes] += dp[left]*dp[right];
            }
        }
        return dp[n];
    }
}
/*
g2 = g0 * g1  + g1 * g0

g3 = g0 * g2 + g1 *g1 + g2 * g0


*/