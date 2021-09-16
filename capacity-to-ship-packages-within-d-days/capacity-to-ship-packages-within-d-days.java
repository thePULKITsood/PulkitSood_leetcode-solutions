class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int hi = 0;
        int lo =weights[0];
        
        for (int i : weights)
        { hi+=i;
         lo = Math.max(lo,i);}
        
       int ans =hi;
        
        while (lo<=hi){
            
            int mid = (lo+hi)/2;
            if(isOk(weights , days , mid)){
                
                ans=Math.min(ans,mid);
                hi = mid-1;
            }
            else lo=mid+1;
        }
        return ans;
        
    }
    boolean isOk(int[] weights, int days,int mid){
        int sum =0;
        int ans =1;
        
        for (int i:weights){
            
            sum+=i;
            
            if(sum>mid){
                sum=i;
                ans++;
            }
        }
        return ans<=days;
    }
}