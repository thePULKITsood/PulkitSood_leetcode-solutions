class Solution {
    public int numOfWays(int n) {
        long a121_2color=6;
        long a123_3color=6;
        
        long b121,b123;
        
        long mod = (long)1e9+7;
        
        for (int i=2;i<=n;i++){
            
            b121= a121_2color*3 + a123_3color*2;
            b123 = a121_2color*2 + a123_3color*2;
            
            a121_2color=b121%mod;
            a123_3color=b123%mod;
            
        }
        return (int) ((a121_2color+a123_3color)%mod);
        
    
        
    }
}
/*

if we look closely 

the configerations can be classified into two groups 
1. 2 colors  -> as    121 
2. 3 colors  -> as    123 

thus first cell or only 1 can have 12 combinations 

121 -> 6   ( 6 of 2 colors )
123 -> 6   ( 6 of 3 colors )


no we need to see that these 12 options how many options can branch out of them
from these 12 
basically  how many   b121 and b123  options i can create 

a three color row can produce  2  3color + 2 2color ;
a  2 color row can produce     2  3color + 3 2color;

a123 ->   2  b123  + 2 b121;
a121  -> 2  b123  + 3 b121;

so now

no of 2 color rows   b121 =   2 * a123 + 3 * a121;   
no of 3 color rows  b123  = 2* a123 ( 3color rows in i-1 row  ) + 2* a121 (2color rows in i-1th row )
 
 
 
*/