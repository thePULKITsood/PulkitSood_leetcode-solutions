class Solution {
    public int longestPalindromeSubseq(String s) {
        int n =s.length();
        
        int dp [][]= new int [n][n];
        int ans=1;
        for (int d = 0;d<n;d++){
        
            for (int i=0;i+d<n;i++){
                int j=i+d;
                
                if(d==0)
                    dp[i][j]=1;
                
                else if(d==1){
                    
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=2;
                    else dp[i][j]=1;
                }
                
                else {
                    
                  
                    if(s.charAt(i)==s.charAt(j)) dp[i][j] = dp[i+1][j-1]+2;
                    else 
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                    
                    
                }
                ans=Math.max(dp[i][j],ans);
            }
        }
        return ans;
        
    }
}