class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       
        int count = 0;
        int n = nums.length;
        for (int i = 0 ; i< nums.length ; i++)
        {
            int prod = 1 ;
            for (int j = i ; j< nums.length ; j++)
            {
                prod*=nums[j];
                
                if (prod < k)
                    count++;
                
                if(prod > k && j <n-1 && nums[j+1]!=1 )
                    break;
            }
        }
        return count ;
    }
}