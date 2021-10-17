class Solution {
    public int maxProfit(int[] prices) {
        int days=prices.length;
        int dp[][] = new int [3][days];
        
        for (int t=1;t<=2;t++){
            int prevDay = -prices[0];
            for (int d=1;d<days;d++){
                // this value will be formed by companrion
                

//                 1. of the last day and same transaction
//                 2. off all the days before this day and one less transaction and the other transaction happening between that day and this day
                
                int  lastday = dp[t][d-1];
                int max=Math.max(lastday,prevDay+prices[d]);
                
               
                dp[t][d]=max;
                prevDay=Math.max(prevDay,dp[t-1][d]-prices[d]);
                
                
            }
        }
            return dp[2][days-1];
        
        
    }
}