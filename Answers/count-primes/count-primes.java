class Solution {
    
    // make a array from 1to n 
    // loop i  from 2 to sqrt(n)
    // for each i loop from i*i to n
    
    
    
//     Questions 
//         1. why sqrt(n)
//         2. why i start form i*i
        
    
    public int countPrimes(int n) {
        boolean isPrime [] = new boolean [n];
        
        Arrays.fill(isPrime,true);
        // isPrime[0] = isPrime[1] = false;
        
       for (int i = 2 ; i*i <= n ; i++)
       {
           if (isPrime[i])
           {
               for (int j = i*i ; j<n ; j += i)
               {
                   isPrime[j] = false;
               }
           }
           
       }
        int count = 0;
           for (int i = 2; i < n; i++) 
           {
               if (isPrime[i]) count++;
            }
        
            return count;

     
   
    
}}
// as constraint is 5*10^6  . our o (n^1.5 ) solution will fail us 
// so we need to get the seive into action 