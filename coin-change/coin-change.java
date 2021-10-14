class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp [] = new int [amount +1];
        Arrays.fill(dp,-1);
        for (int c : coins)
            if(c<=amount)
            dp[c]=1;
        
        dp[0]=0;
        for (int i=1;i<=amount ; i++)
        {
            if(dp[i]==1 )continue;
            int ans = Integer.MAX_VALUE;
            for (int c : coins){
                if(i-c >0 && dp[i-c]>0){
                    ans=Math.min(ans,dp[i-c]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE)
                dp[i]=ans;
        }
        return dp[amount];
    }
}