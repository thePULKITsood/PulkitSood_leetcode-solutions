class Solution {
    public int minCost(int[][] costs) {
        int houses = costs.length;
        if(houses == 0) return 0;
        
        int[][] dp = new int[houses][3];
        dp[0] = costs[0];

        for(int i = 1; i < houses; i++){
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
        }

        return Math.min(dp[houses - 1][0], Math.min(dp[houses - 1][1], dp[houses - 1][2]));
    }
     
}

// [][] = [house no] [color]
//         3 colors - > red blue green