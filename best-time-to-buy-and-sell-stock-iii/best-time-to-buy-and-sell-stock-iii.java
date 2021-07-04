class Solution {
    public int maxProfit(int[] p) {
//         approach by - sumit sir == bidirectional dp 
 
//         filling the left dp 
        int n = p.length;
        
        int leftdp[] = new int [n+1];
        int lmine =p[0];
        
        for (int i = 1 ; i < n ; i++){
            
            if (p[i] < lmine){
                lmine = p[i];
            }
            leftdp [i]  =Math.max(leftdp [i-1] , p[i] - lmine); 
        }
        
        int rightdp[] = new int [n+1];
       
        int rmaxe =p[n-1];
        
        for (int i = n-2 ; i>= 0 ;i--){
            
            if (p[i] > rmaxe){
                rmaxe = p[i];
            }
             
            
            rightdp [i]  =Math.max(rightdp[i+1], rmaxe -p[i] ); 
        }
        int maxprofit = 0;
        for (int i = 0 ; i < n + 1 ;i++){
            maxprofit = Math.max(maxprofit,leftdp[i]+rightdp[i]);
        }
        
        return maxprofit;
    }
}


//in the left dp i am storing  the max profit i can make by buying and selling on the left side 

//for this i have to check the current max and the profit made by selling today and update the maximum 

 // for the right dp i have to check themax profit htat can be made on the right by buying and selling 

// for that i check the max of max and the profit if i buy today and sell on a higher price later 

// they are basically reverse of each other 