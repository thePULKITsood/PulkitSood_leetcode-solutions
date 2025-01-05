class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hi =0;
        int lo = 1;
        for (int i: piles)
            hi=Math.max(i,hi);
        
        int ans = hi;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(mid,piles,h)){
                ans=Math.min(ans,mid);
                hi=mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
    boolean isPossible(int mid , int []piles , int h){
        int num =0;
        for (int i: piles){
            num+= i/mid;
            if(i%mid!=0)             
            num++;
        }
        return (num<=h);
    }
}