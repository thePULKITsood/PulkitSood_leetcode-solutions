class Solution {
    public long maxMatrixSum(int[][] A) {
        //if odd numner of -ve then i will skip the smallest one 
        //if even number of -ve then i can make them all positive
        
        
        int n=A.length;
        int m =A[0].length;
        int count =0;
        long sum =0;
        int smallest =Integer.MAX_VALUE;
        boolean containsZero=false;
        //find the smallest -ve number 
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                sum+=Math.abs(A[i][j]);
                if(A[i][j]==0)
                    containsZero=true;
                
                if(A[i][j]<0)
                    count++;
                    
                smallest=Math.min(smallest,Math.abs(A[i][j]));
                
                
                
            }
        }
        
        if(count%2==1 && !containsZero){
            sum-=(2*smallest);
        }
        return sum;
        
        
    }
}