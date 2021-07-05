class Solution {
    public int minDistance(String s1, String s2) {
        int m =  s1.length();
        int n = s2.length();
        int [][] memo =new int  [m+1][n+1];
        // Arrays.fill(memo,-1);
        return help ( s1,s2,m,n,memo);
        
        
    }
      int  help(String s1, String s2,int i ,int j ,int [][]memo )
      {
        if (memo[i][j] != 0)
            return memo[i][j];
          
        if (i==0) 
            return memo[i][j] = j ;
          
        else if (j==0) 
            return memo[i][j] = i;
        
        if (s1.charAt(i - 1 ) == s2.charAt(j - 1 ))
        {
            return (memo[i][j]= help (s1,s2, i-1 , j-1 ,memo));
        }
          
        else
        {
            
            int  insert  = help (s1,s2,i , j-1 ,memo);
            
            int  delete = help  (s1,s2,i-1,j,memo);
            
            int  replace = help (s1,s2,i-1,j-1,memo);
            
        
            return (memo[i][j]= 1 + Math.min(insert , Math.min(delete,replace)));
        }
          
        
    }
}