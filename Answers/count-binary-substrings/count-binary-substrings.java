class Solution {
    public int countBinarySubstrings(String s) {
    
        char arr[] = s.toCharArray();
        int n = arr.length;
        int dp[] = new int [n];
        int count =0;

        for (int i = 0 ; i< n ; i++){
            if (arr[i] == '0'){
                if (i==0) dp[i] =1 ;
                
                else if(arr[i-1] == '0')
                    dp[i]=dp[i-1]+1;
                
                else dp[i] =1 ;
                
                int idxtosearch = i-dp[i];
                
                if(idxtosearch >=0){
                    if(dp[i]<=dp[idxtosearch])
                        count++;
                }
                
            }
            else{
                if (i==0) dp[i] =1 ;
                
                else if(arr[i-1] == '1')
                    dp[i]=dp[i-1]+1;
                
                else dp[i] =1 ;
                
                int idxtosearch = i-dp[i];
                
                if(idxtosearch >=0){
                    if(dp[i]<=dp[idxtosearch])
                        count++;
                }
                
            }
            
        }
        return count;
    }
}


// group of zeros followed by ones 
//  or group of 1s followed by grp of zeros 
