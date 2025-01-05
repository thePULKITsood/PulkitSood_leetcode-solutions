class Solution {
    public int findMiddleIndex(int[] nums) {
        long left = 0;
        long right =0;
        for (int i:nums)
            right+=i;
        
        int n = nums.length;
        for (int i=0;i<n;i++){
            right-=nums[i];
            if(left==right)
                return i;
            
            left+=nums[i];
            
        }
        return -1;
        
    }
}