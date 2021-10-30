class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int sum =0;
        for (int n:nums)
            sum+=n;
        
        if(sum%2==1)return false;
       dp=new Boolean[sum/2 + 1][nums.length+1];
        
        return func(nums,sum/2,0);
        
        
    }
   boolean func(int []nums, int target,int idx){
        
        if(target==0 && idx<nums.length)return dp[target][idx] = true;
     
        if(idx>=nums.length || target<0)return false;
        
        if(dp[target][idx]!=null)return dp[target][idx];
        
        if (func(nums,target,idx+1) || func(nums,target-nums[idx],idx+1))
            return dp[target][idx]=true;
        
        return dp[target][idx]= false;
    }
}