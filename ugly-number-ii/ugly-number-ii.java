class Solution {
    public int nthUglyNumber(int n) {
        int dp [] = new int [n+1];
        dp[1]= 1;
        int p2 =1;
        int p3= 1;
        int p5 = 1;
        
        
    for (int i = 2 ; i<=n ; i++){
         int f2 = 2* dp[p2];
         int f3 = 3* dp[p3];
         int f5 = 5* dp[p5];
    
        int min  = Math.min (f2, Math.min(f3,f5));
        dp[i] = min;
          if (min == f2) p2 ++;
          if (min == f3) p3 ++;
          if (min == f5) p5 ++;
      
        
            
    }
        return dp[n];
    }
}
// i will move the pointers one by one and on the ugly numners array only 

// i will multiply 
// 2 with 2 ptr 
// 3 with 3 ptr 
// 5 with 5 ptr 

// and then i will see which one is the smallest 
// and i will make that one the next ugly number and i will 
// update the pointr of the smallest one 

// basically we will consider the multiples of 2 3 5 and only those multiples which are ugly numners them selves  - means only the ugly nmbers

