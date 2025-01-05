class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        
        double curr [][] = new double [n][n];
        double next [][] = new double [n][n];
        
        curr[row][column] =1.0;
        
        int [][] dir =new int[][]{{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        
        while (k-->0){
            
            for (int i = 0 ; i<n ; i++){
                for (int j=0;j<n;j++){
                    
                    if(curr[i][j]!=0){
                        
                        //go to all the 8 sides and make them 
                        
                        for (int d []: dir){
                            
                            int rr = i+d[0];
                            int cc = j+d[1];
                            
                            if(rr>=0 && rr<n && cc>=0 && cc<n){
                                next[rr][cc] += curr[i][j]/8.0;
                            }
                            
                        }
                    }
                }
            }
            curr=next;
            next = new double[n][n];
        }
        double sum = 0;
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                sum+=curr[i][j];
            }
        }
        return sum;
        
    }
}