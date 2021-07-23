class Solution {
    
    public int longestPalindromeSubseq(String s) {
        int n= s.length();
       return solve (s,0,n-1 , new Integer[n][n]);
        
    }
    int solve(String s , int i , int j , Integer[][] memo){
        
        if (memo[i][j] !=null)
            return memo[i][j];
        
        if (i>j) return 0;
        if ( i==j) return 1 ;
        int ans = 0;
        
        if(s.charAt(i)==s.charAt(j))
            ans = solve(s,i+1, j-1 , memo) +2 ;
        
        else 
            ans = Math.max(solve(s,i+1 , j , memo) , solve(s,i,j-1, memo));
        
        
        memo[i][j] = ans;
        return memo[i][j];
    }
}