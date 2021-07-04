class Solution {
    public int[] countBits(int n) {
        
        int dp [] = new int [n+1];
       
        dp[0]=0;
         if (n==0) return dp;
        
        dp[1]=1;
        if (n==1) return dp;
        
        dp[2] = 1;
        if (n==2) return dp;
        
        int last2power = 2;
        for (int i =3;i<=n;i++){
            if(i == 2*last2power)
            {    last2power=i;
                dp[i] = 1;
                continue;
            }
            dp[i] = dp[last2power] + dp[i-last2power];
            
        }
        return dp;
    }
}
// 0- 00

// 9 - 1001
//     9 --> power of 2 and other 1
//     ==1 + number of ones in other   -  >as the number of 1s in power of 2 is always 1 
    
//     0 - 0
//     1 - 1 
//     2 - 1
//     3 - 2
//     4 - 1 
//     5 - 1+1 = 2
//     6 - 1 + 1 = 2
    
    
//     // how to find the nearest power of two  
//     //just keep it in a variable 