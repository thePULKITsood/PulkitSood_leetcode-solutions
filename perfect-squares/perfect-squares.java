class Solution {
    int memo[];
    public int numSquares(int n) {
        memo=new int[n+1];
        return fun(n);
        
    }
    int fun (int num ){
        if(memo[num]!=0)
            return memo[num];
        
        if (num == 0)
            return 0;
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 1 ; i*i <=num ; i++){
                int ans = fun (num-(i*i)) ;
            
                min = Math.min(ans,min);
            }
        
        return memo[num]=min+1;
    }
}