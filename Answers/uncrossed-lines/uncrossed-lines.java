class Solution {
    
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length ;
        int m = nums2.length ;
      
        int dp [][] = new int [n+1][m+1];
//         as i am thinking from traversing the array from the last to the frot in that way i must fill my dep from left ot right and from top to bottom thus i will fill my fp from left to right form top to bottom 
            
//             ans i will think of the problem as going form  last to front 
            
        
            for (int i = 0 ; i<= n ;i++){
                
            for (int j=0 ; j <= m ; j++){
                
                if (i==0 || j==0) 
                {
                dp[i][j]=0;
                 
                 continue;
                }
                
                
                
                if (nums1[i-1]==nums2[j-1])
                    dp[i][j] = 1+  dp[i-1][j-1];
                
                else 
                   dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                
            }
        }
        return dp[n][m];
       
    }
}