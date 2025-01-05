class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        int n = arr.length;
        if(n<2)return n;
        int start =0;
        int end = start+1;
        int ans =1 ;
        while (start+1<n){
            if(arr[start]==arr[start+1])
            {
                start++;
                continue;
            }
            end = start +1 ;
            while (end<n-1 && isvalid(arr,end))
            {
                end++;
            }
            ans=Math.max(ans,end-start+1);
            start = end ;
            
        }
        return ans;
    }
    boolean isvalid(int arr[] , int k){
        if((arr[k]>arr[k-1] && arr[k]>arr[k+1] )|| (arr[k]<arr[k-1] && arr[k]<arr[k+1] ))
            return true;
        
        return false;
    }
}