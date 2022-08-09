class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
        Arrays.sort(arr);
        int N = arr.length;
        int MOD= 1000000007;
        long dp[]= new long[N];
        
        Arrays.fill(dp,1);
        
        // Now  3 loop  for every number i need the pairs that make up that number and then i will multiply their dp and get my value 
        
        Map<Integer,Integer> mapOfIndex = new HashMap();
        
                for (int i = 0 ; i < N ; i++)
                mapOfIndex.put(arr[i],i);
                
        for (int i = 0 ; i < N ; i++){
            
            int prod = arr[i];
            
            for (int j = 0 ; j<i;j++){
                
                int left = arr[j];
               
                if( prod % left == 0){
                
                    int right = prod/left;
                    // now find right 
                    if(mapOfIndex.containsKey(right)){
                        dp[i] = (dp[i] + dp[j]*dp[mapOfIndex.get(right)]) % MOD;
                        
                        
                    }
                    
                
                }
                
            }
            
        }
        long ans =0;
        for (long x : dp ) ans +=x;
        return (int) (ans%MOD);
    }
}
