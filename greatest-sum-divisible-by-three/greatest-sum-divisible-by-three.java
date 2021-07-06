class Solution {
    public int maxSumDivThree(int[] nums) {
        int dp []  = new int [3];
        
        for (int a : nums ){
            int d0 = dp[0] + a;
            int d1 = dp[1] + a;
            int d2 = dp[2] + a;
            
//              now i have all the ds  now i will update the values 
            int rem = d0%3;
            dp[rem] = Math.max(dp[rem] , d0);
            
            rem = d1%3;
            dp[rem] = Math.max(dp[rem] , d1);
            
            rem = d2%3;
            dp[rem] = Math.max(dp[rem] , d2);
        }
        return dp[0];
        
    }
}