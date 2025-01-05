class Solution {
    public int numSubmat(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        
        int grid[][]= new int [r][c];
        
        for (int i=0;i<r;i++){
            int sum=0;
            for (int j=c-1;j>=0;j--){
                
                if(mat[i][j]==1)
                sum++;
                else 
                    sum=0;
                
                grid[i][j]=sum;
            }
        }
        int ans =0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                int x=Integer.MAX_VALUE;
                for (int k=i;k<r;k++){
                    x=Math.min(grid[k][j],x);
                    ans+=x;
                }
            }
        }
        return ans;
    }
}