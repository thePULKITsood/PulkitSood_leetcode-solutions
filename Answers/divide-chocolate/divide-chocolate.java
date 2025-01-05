class Solution {
    public int maximizeSweetness(int[] arr, int k) {
        int lo= arr[0];
        int hi=0;
        for (int i : arr){
            hi+=i;
            lo=Math.min(lo,i);
        }
        int ans =0;
        while (lo<=hi){
            int mid = (lo+hi+1)/2;
            if(isOk(arr,k,mid)){
                lo = mid+1;
                ans=Math.max(ans,mid);
                
            }
            else 
                hi=mid-1;
        }
        return ans;
    }
    boolean isOk(int []arr,int k,int mid){
        int sum =0;
        int ans =0;
        for (int i:arr){
            sum+=i;
            if(sum>=mid){
                sum=0;
                ans++;
            }
        }
        return ans>k;
    }
}