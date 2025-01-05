class Solution {
     int n , m ;
    Integer memo[][];
    public int numDistinct(String s, String t) {
          n = s.length();
        m = t.length ();
        memo = new Integer [n][m];
       
        return solve (s,t,0,0);
        // return memo[n-1][m-1];
    
    }
    int solve (String s, String t, int i , int j){
           if(j==m) return 1 ;
            if(i==n)return 0;
           
        
        if (memo[i][j]!=null)
            return memo[i][j];
        
        if(s.charAt(i)==t.charAt(j))
            memo[i][j] =  solve(s,t,i+1,j+1) + solve (s,t,i+1 , j);
        
        else 
            memo[i][j]= solve(s,t,i+1,j);
        
        return memo[i][j];
    }
}