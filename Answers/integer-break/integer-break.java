class Solution {
    public int integerBreak(int n) {
        
        return func(n,new int [n+1]);
        
    }
    int func(int n ,int memo[]){
        if(memo[n]!=0)
            return memo[n];
        int max = 1 ;
        
        for (int i=1;i<n;i++){
        
            max = Math.max(max ,
                                i* Math.max (n-i,func(n-i,memo) ) );
        }
        return memo[n]=max;
        
    }
}

//  >= 2 parts break  and return the aximum product 

// for all k 1 -> n-1 
// f(n)  = k * Max(n-k  ,  func(n-k));
//return the max