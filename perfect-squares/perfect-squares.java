class Solution {
    
    public int numSquares(int n) {
        
        int dp[] = new int [n+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        
        dp[0]=0;
        //base case 
        
        for (int i=1 ; i<=n ; i++){
            
            //for finding each value of the dp array 
            //now to find the value of one cell 
            
            for (int j=1 ; j*j<=i ; j++)
                
                dp[i]= Math.min (dp[i] , dp[ i - j*j ]  + 1 );
            
        }
        return dp[n];
        
    }
}
