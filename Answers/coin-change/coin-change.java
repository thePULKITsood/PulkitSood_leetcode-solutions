class Solution {
    int dp[];
    public int coinChange(int[] coins, int amount) {
        dp=new int [amount+1];
        int ans = func(coins,amount);
        
        if(ans>=Integer.MAX_VALUE-1)
            return -1;
        
        else return ans;
        
    }
    int func (int []coins,int amount){
        
        if(amount==0)return 0;
        int min = Integer.MAX_VALUE-1;
        
        if(amount<0)return min;
        if(dp[amount]!=0)return dp[amount];
        
        for(int c : coins){
            int ans = func(coins,amount-c);
            min = Math.min(ans,min);    
        }
        return dp[amount]=min+1;
    }
}