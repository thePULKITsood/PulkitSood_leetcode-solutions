class Solution {
    public int trap(int[] h) {
        int n  = h.length;
        if (n==0 ) return 0;
        int left[] = new int[n]  ; // -> it will store maximum to the left 
        int right [] = new int [n] ; // it will store maximum to the right for that index 
            
            
            left [0] = h[0];
        
            for (int i = 1 ; i < n ; i ++){
                
                if (h[i] > left[i-1])
                    left[i] = h[i];
                else 
                    left[i]=left[i-1];
                
            }
        
        right[n-1] = h[n-1];
        
            for (int i = n-2  ; i >= 0 ; i --){
                
                if (h[i] > right[i+1])
                    right[i] = h[i];
                else 
                    right[i]=right[i+1];
                
            }
        
            int ans=0;
        
            for (int i = 0 ; i < n ; i ++){
                
            
                    ans += Math.min(right[i] , left[i]) - h[i];
            }
        return ans;
        
    }
}

// just make two arrays max till left and max for right 