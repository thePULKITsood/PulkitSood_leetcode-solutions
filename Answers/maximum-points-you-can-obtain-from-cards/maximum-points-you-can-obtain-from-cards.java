class Solution {
    public int maxScore(int[] A, int k) {
        int sum =0;
        for (int i : A){
            sum+=i;
        }
        int n = A.length;
        int i=0;
        int j=0;
        int running =0;
        
        while (j < n-k)
            running += A[j++];
        
        int min = running ;
        while (j<=n){
            min = Math.min(min,running);
            if(j<n)
            running += A[j];
            if(i<n)
            running -= A[i];
            j++;
            i++;
            
        }
        return sum-min;
        
    }
}