class Solution {
    int n =0;
    int memo[][];
    int mod = 1000000007;
    public int numTilings(int num) {
        n=num;
        memo=new int [n+1][n+1];
        return func(0,0);
        
    }
    int func (int up , int down ){
        if(up>n || down>n)return 0;
        if(up==n && down ==n) return 1;
        
        if(memo[up][down]!=0)return memo[up][down];
        int ans =0; 
        
        if(up==down){
            
            // two tile
            ans+= func(up+1,down+1);
           ans%=mod;
            ans+=  func(up+2,down+2);
           ans%=mod;
//             3 tile
            ans+= func(up+2,down+1);
           ans%=mod;
            ans+= func(up+1, down+2);
            ans%=mod;
            
        }
        else if (up-down==1){
        
                // two tile
            // ans+= func(up+2,down+2);
            ans+= func(up,down+2);
           ans%=mod;
//             3 tile
            ans+=func(up+1,down+2);
        ans%=mod;
        }
        else if (down-up==1){
            
                // two tile
            // ans+= func(up+2,down+2);
              ans+= func(up+2,down);
           ans%=mod;
//             3 tile
            ans+=func(up+2,down+1);
            ans%=mod;
        }
//         else if (up-down ==2){
//                 // two tile
//             ans+= func(up,down+2);
//       }
        
//         else if (down-up==2){
//              // two tile
//             ans+= func(up+2,down);
            
//         }
        return memo[up][down]= ans%mod ;
    }
}