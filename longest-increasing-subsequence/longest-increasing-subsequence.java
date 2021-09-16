class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int dp [] =new int [n];
           int omax = 1;
        for (int i = 0 ; i < n ; i++){
            
            int max =1 ;
            
            for (int j=i-1;j>=0;j--){
                
                if (nums[i]>nums[j]  ){
                    
                    max = Math.max(dp[j] + 1 , max);
                    
                }
            }
            dp[i]=max;
            if (dp[i] > omax)
                omax = dp[i];
        }
     
       
        return omax;
    }
}

// for each point  i will store the value of the longest inc subsequence that ends on that point 

// for a new point i will traverse all its left parts and if the point is valid  i will check my max and update my max accordinglt and 

// n2 solution 
