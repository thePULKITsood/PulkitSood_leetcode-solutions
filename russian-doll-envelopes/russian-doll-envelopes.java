class Solution {
    public int maxEnvelopes(int[][] env) {
        Arrays.sort(env,(a,b)-> {
            if(a[0]!=b[0])
            return a[0]-b[0];
            return b[1]-a[1];
        });
        // Arrays.sort(env)
            //sort in increasing order on basis of first and on basis of dec order on 2nd
            
            //now 
            int n = env.length;
            int dp[]=new int [n];
        int ans=0;
        
            for (int i=0;i<n;i++){
                //we will find how many of the envoleps can this fit 
                int max=0;
                for (int j=0 ; j<i;j++){
                   
                    if(env[j][0]<env[i][0] && env[j][1]<env[i][1]){
                        max = Math.max(max,dp[j]);
                    }
                    
                }
                dp[i]=max+1;
                ans=Math.max(ans,dp[i]);
            }
        return ans;
    }
}