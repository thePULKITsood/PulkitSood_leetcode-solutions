class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return back(nums,0,0,target,nums.length);
        
    }
    int back(int nums[] ,int sum, int i , int target, int n  ){
        if(i==n){
            if(sum==target)
                return 1 ;
            else return 0;
            
        }
        return back(nums,sum+nums[i] , i+1,target,n) +
        back(nums,sum-nums[i],i+1 , target,n);
    }
}