class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        if(n==0 || k==0)return 0;
        
        Arrays.sort(nums);
        int i=0;
        int j = k-1;
        int ans = nums[j]-nums[i];
        while (j<n){
            ans = Math.min(ans,nums[j]-nums[i]);
            i++;
            j++;
        }
        return ans;
        
    }
}