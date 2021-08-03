class Solution {
    public String longestPalindrome(String s) {
     int n = s.length();
        int max = 0;
        int start =0;
        int end = 0;
    boolean dp[][] = new boolean [n][n];
        // i must move diagonally 
        
        for (int d = 0 ;d<n ; d++){
            for (int i = 0 ; d+i <n  ; i++){
                int j = d+i;
                if(d==0)
                    dp[i][j] = true;
                else if (d==1)
                    dp[i][j] = (s.charAt(i)==s.charAt(j));
                else 
                    dp[i][j] = dp[i+1][j-1]&&(s.charAt(i)==s.charAt(j));
                
                if(dp[i][j] &&(j-i+1 > max))
                {
                    max = j-i+1;
                    start = i;
                    end = j;
                }            
            }
        }
        return s.substring(start,end+1);
        
        
    }
}