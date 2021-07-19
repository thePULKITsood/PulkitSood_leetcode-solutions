class Solution {
    public int pivotIndex(int[] nums) {
        int right = 0;
        for (int n : nums)
        right+=n;
        
        int leftsum=0;
        for (int i = 0 ; i< nums.length ; i++)
        {
           right -=nums[i];
            if(leftsum==right)
                return i;
            
            leftsum+=nums[i];
            
          
        }
        return -1;
    }
}