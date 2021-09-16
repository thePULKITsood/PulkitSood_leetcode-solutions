class Solution {
    public int splitArray(int[] nums, int m) {
        // we can search the sum htat will allow us to do the partition 
        int left=0;
        int right =0;
        for (int i : nums){
            right+=i;
            left = Math.max(left,i);
        }
        int ans = right;
        
        while (left<=right){
            int mid = (left + right)/2;
            
            if(isOk(nums,m,mid)){
                right = mid-1;
                ans=Math.min(ans,mid);
            }
            else left = mid+1;
        }
        return ans;
        
    }
    boolean isOk(int nums[],int m , int mid){
        int ans=1;
        int sum=0;
        for (int i:nums){
            sum+=i;
            if(sum>mid){
                ans++;
                sum=i;
            }
        }
        return ans<=m;
    }
}   