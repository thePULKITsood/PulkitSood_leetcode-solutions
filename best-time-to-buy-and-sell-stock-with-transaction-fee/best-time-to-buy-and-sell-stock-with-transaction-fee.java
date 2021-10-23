class Solution {
    int memo[][];
    public int maxProfit(int[] prices, int fee) {
        // as the only changing values are int i and bag so make a dp on it 
        memo=new int [prices.length][2];
        return func (0,prices,fee,0);
    }
   int  func (int i , int []prices, int fee , int bag){
       //this function returns the max profit depending on the state i am in 
       // and the decisions i take 
       
       if(i>= prices.length)
           return 0;
       //it is what it is 
       
       if(memo[i][bag]!=0)return memo[i][bag];
       
        if(bag==1){
            // means i have bought something ;
            
            int skipnow = func(i+1,prices,fee,1);
            int sellnow = prices[i] - fee + func(i+1,prices,fee,0);
        
            return memo[i][bag]= Math.max(skipnow,sellnow);
        }
        else if(bag== 0){
            // means i have nothing something ;
            
            int skipnow = func(i+1,prices,fee,0);
            int buynow = -prices[i] + func(i+1,prices,fee,1);
        
            return   memo[i][bag]= Math.max(skipnow,buynow);
        }
       return 0;
        
    }
}