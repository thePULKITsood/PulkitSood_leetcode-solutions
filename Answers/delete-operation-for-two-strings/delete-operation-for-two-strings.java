class Solution {
    public int minDistance(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();
        
        int dp [][] = new int [m+1][n+1];
        
        
        // left to right --> top to bottom 
for (int i = 0;i<=m ;i++){
    for (int j = 0 ; j<=n ; j++){
     
        if (i==0)
        {
            dp[i][j] = j;
            continue;}
        
        else if (j==0) {
            dp[i][j] = i;
            continue;}
        if (s1.charAt(i-1) == s2.charAt(j-1))
            dp[i][j] = dp[i-1][j-1];
        
        else {
            int del1 = dp[i-1][j];
            int del2=dp[i][j-1];
            dp[i][j] = 1+ Math.min(del1,del2);
        }
    }
    
}
    return dp[m][n];

        
    }
}



// what i can do is start from th elast 
// if -- the characters are qual then go to i-1 , j-1 
//     and if they are diff then make two calls fun (i-1,j  and fun (i,j-1 ))
//         and return th emin of them + 1 ;

// 1 . recursive
// 3. recursion + memo 
// 2. tabulation

// func =  if same dp[i-1][j-1]  if diff 1+min (dp[i-1][j] , dp[i][j-1])
    
    
//     base case if (s1.length = 0 return j )