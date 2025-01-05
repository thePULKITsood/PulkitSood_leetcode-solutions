class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        /*
         dp 1 d  - meaning yahan par khatm hone walle kitne ap's hai
        
        */
        
        int n = nums.length;
        int dp[]=new int [n];
        int sum=0;
        for (int i=2 ; i<n ; i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
                dp[i]= dp[i-1]+1;
            sum+=dp[i];
        }
        return sum;
    }
}

/*
1 2 3 4 5 6 8 
 1 1 1 1 2 2  


*/