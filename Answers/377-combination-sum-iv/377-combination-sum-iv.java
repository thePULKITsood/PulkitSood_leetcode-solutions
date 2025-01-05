class Solution {
    public int combinationSum4(int[] nums, int target) {
//         tabulation solution we know that
        // func [target ]= func [target - arr[k]]
        
        int dp[] = new int [target + 1];
        dp[0] =1 ;
        
        
        for (int num =1 ; num<=target ; num++ )
        {
//             for each numer we see all the previous numbers 
            
            for (int a : nums )
            {
                if (num -a>=0)
                dp[num]+= dp[num-a];
            }
        }
        return dp[target];
    }
}