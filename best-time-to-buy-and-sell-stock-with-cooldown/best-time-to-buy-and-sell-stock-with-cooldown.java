class Solution {
    public int maxProfit(int[] prices) {
        int dp[][]=new int [prices.length][2];
        return help(0,prices,0,dp);
    }
    int help(int i , int []prices, int bag,int dp[][]){
        if(i>=prices.length)return 0;
        if(dp[i][bag]!=0)return dp[i][bag];
        
        if(bag==1){
            //bag ==full meaning we must either sell or skip 
           
            //selling the stock -> as we have sold the stock thus we must follow cool down and go to i+ 2 day
            
            int op2= prices[i] + help(i+2,prices,0,dp);
            int op3 = help(i+1,prices,1,dp);
            return dp[i][1]=Math.max(op2,op3);
        }
        
        else {
            // as the bag is empty i must make a but 
            int op1 = -prices[i]+ help(i+1,prices,1,dp);
           int op3 = help(i+1,prices,0,dp);
            return dp[i][0]=Math.max(op1,op3);
        
        }
        
    }
}