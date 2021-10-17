class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int ans =1;
        long sum =0;
        int last =0;
        
        int n =nums.length;
        
        for (int i=0;i<n;i++){
            sum+=nums[i];
            
            if(sum+k >= nums[i] * (i-last+1))
                ans=Math.max(ans,i-last+1);
            
            else {
                while(sum + k <nums[i] * (i-last+1)){
                    sum-=nums[last++];
                }
            }
        }
        return ans;
        
    }
}