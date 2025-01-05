class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
      
        int p = primes.length;
        int pointer[] = new int [p];
        Arrays.fill(pointer,1);
        
        int dp [] = new int [n+1];
        dp[1] = 1;
        
        for (int i =  2 ;i<= n ;i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0 ; j< p ;j++){
                int  val = primes[j] * dp[pointer[j]];
                if (val<min)
                    min=val;
            }
            dp[i] = min;
            
            // moving the pointers of all the numbers 
        
            for (int j = 0 ; j< p ;j++){
                int  val = primes[j] * dp[pointer[j]];
                if (val==min)
                    pointer[j]++;
            }
        }
        
        return dp[n];
    }
}
//  we will keep a pointer array 
// and to find the min we will use a  min heap or a priority q 
