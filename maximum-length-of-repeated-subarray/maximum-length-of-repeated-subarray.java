class Solution {
    public int findLength(int[] n1, int[] n2) {
        int n1l= n1.length;
        int n2l = n2.length;
        int max=0;
        int dp [][] = new int [n1l + 1] [n2l + 1];
        
        for (int i=1 ; i<=n1l ;i++){
            for (int j=1; j<=n2l ; j++){
                
                if(n1[i-1]==n2[j-1])
                    dp[i][j] = 1+ dp[i-1][j-1];
                
                max=Math.max(max,dp[i][j]);        
            }
        }
        return max;
        
    }
}