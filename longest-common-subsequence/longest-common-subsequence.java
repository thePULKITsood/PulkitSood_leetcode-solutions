class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length();
        int m = t2.length();
        
        int dp[][]  = new int [n+1][m+1] ; 
        
        for (int i = 0 ; i <= n ; i++){
            for (int j=0;j<=m ; j++){
                    if(i==0 || j==0){
                        dp[i][j] = 0;
                    
                    continue;}
                
                if(t1.charAt(i-1)==t2.charAt(j-1))
                    dp[i][j] =1 + dp[i-1][j-1];
                else 
                dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]);
                
            }
        }
        return dp[n][m];
        
    }
}