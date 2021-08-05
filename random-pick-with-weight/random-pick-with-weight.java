class Solution {
    
    int psum [] ;
    public Solution(int[] W) {
        psum = new int [W.length];
        
        psum[0]=W[0];
        for (int i = 1 ;i<W.length ; i++){
            psum[i] = psum[i-1] + W[i];
        }
       
        
    }
    
    public int pickIndex() {
        double target = psum[psum.length-1] * Math.random();
        int l = 0;
        int h = psum.length-1;
        
        while (l<h)
        {
            int mid = l+(h-l)/2;
            
            if(psum[mid]<target)
                l = mid+1;
            else h=mid;
        }
        return l;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */