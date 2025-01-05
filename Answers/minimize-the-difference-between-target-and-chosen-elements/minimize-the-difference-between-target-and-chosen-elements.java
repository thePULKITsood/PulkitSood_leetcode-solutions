class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        
        int row= mat.length;
        int col = mat[0].length;
        
        int dp1[] = new int [4901];
        
        for (int j=0;j<col;j++){
            dp1[mat[0][j]] = 1;
        }
        
        for (int i=1;i<row;i++){
             int dp2[]=new int [4901];
            
            for (int j=0;j<col;j++)
            {
                for (int k =0;k<4901 ; k++){
                    if(dp1[k] == i )
                    {
                        dp2[k +mat[i][j]]=i+1;
                    }
                    
                }
                
            }
            dp1=dp2;
            
        }
        int ans =Integer.MAX_VALUE;
        for (int i =0;i<4091 ; i++){
            if(dp1[i]==row)
            {
                ans=Math.min(ans,Math.abs(target-i));
            }
        }
        return ans;
    }
}