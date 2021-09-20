class Solution {
    public int maxEnvelopes(int[][] env) {
        
        Arrays.sort(env,(a,b)->{
            if(a[0]==b[0])return a[1]-b[1];
            else return a[0]-b[0];
        });
       
        int n=env.length;
        int dp[]=new int [n];
        
        Arrays.fill(dp,1);
        
        for (int i=1;i<n;i++){
            
            int max =0;
            
            for (int j=i-1;j>=0;j--){
                
                if(env[i][0]>env[j][0] && env[i][1]>env[j][1])
                    max=Math.max(dp[j],max);
            }
            dp[i]+=max;
            
        }
        
        int ans =1;
        for (int i : dp)
            ans=Math.max(i,ans);
        
        return ans;
    }
}