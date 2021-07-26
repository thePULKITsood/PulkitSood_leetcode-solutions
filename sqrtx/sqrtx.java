class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x ;
        
        int l = 2 ;
        int r = x/2;
        long num ;
        
        while (l <= r){
            int mid = (l+r) /2;
            num = (long) mid * mid;
            
            if(num>x) r = mid-1;
            
            else if (num<x) l = mid+1;
            
            else return mid;
        }
        return r;
    }
}