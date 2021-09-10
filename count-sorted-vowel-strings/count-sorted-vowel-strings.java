class Solution {
    public int countVowelStrings(int n) {
        int dp [][]=new int [5][2];
        for (int i=0;i<5;i++){
            dp[i][0]=1;
        }
        while (n-->1){
            for (int i=0;i<5;i++){
                int ans =0;
                for (int j=0;j<=i;j++){
                    ans+=dp[j][0];
                }
            dp[i][1]=ans;
        }
             for (int i=0;i<5;i++){
            dp[i][0]=dp[i][1];
        }
            
        }
        int ans=0;
         for (int i=0;i<5;i++){
         ans+=  dp[i][0];
        }
        return ans;
    }
}