class Solution {
    int dp[][][];
    public int findMaxForm(String[] strs, int m, int n) {
         dp = new int [m+1][n+1][strs.length];
        return func(strs,m,n,0);
        
    }
    int func(String[] strs, int zero, int one , int idx){
        // two options -> add  / skip 
        
        if(idx==strs.length || (zero==0 && one==0) )return 0;
        
        if(dp[zero][one][idx]!=0)return dp[zero][one][idx];
        
        int count [] = count(strs[idx]);
        int add=0;
        if(zero>=count[0] && one >= count[1]){
            //we can add
           add = 1+ func(strs,zero-count[0],one-count[1],idx+1);
        }
        
        //skip 
        int skip = func(strs,zero,one,idx+1);
        
        return dp[zero][one][idx]=Math.max(add,skip);
        
    }
    int [] count (String s){
        int zero=0;
        int one=0;
        for(char c:s.toCharArray()){
            if(c =='1')
                one++;
            else zero++;
        }
        return (new int []{zero,one});
    } 
}