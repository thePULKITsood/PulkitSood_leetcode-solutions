class Solution {
    public int maxProfit(int k, int[] prices) {
        int days = prices.length;
        if(days==0 || k==0)return 0;
         int dp [][] = new int [k+1][days];
        
        for (int t=1;t<=k ; t++){
            for (int d=1;d<days;d++){
                int max = dp[t][d-1];  // if all the transactions have been done on the day before
                
                // now i need to find when i have done t-1 transactions in the past 
                // i need to find the max between that
                
                for(int pd=0;pd<d;pd++){
                    int profit_if_transact = prices[d]-prices[pd];
                    int profit_with_tm1_trans= dp[t-1][pd];
                    
                    max=Math.max(max,profit_if_transact+profit_with_tm1_trans);
                }
                dp[t][d]=max;
            }
        }
        return dp[k][days-1];
        
    }
}