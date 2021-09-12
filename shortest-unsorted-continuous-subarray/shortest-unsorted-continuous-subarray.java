class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i=1;i<n;i++){
            
            if(nums[i]<nums[i-1])
            flag = true;
            
            if (flag)
                min = Math.min(min, nums[i]);
        }
        
        flag =false;
        for (int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1])
              flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        
        
    
        
        // now as we have min and max now we will find the  place for min in the start from 0 to l and  for max in right to n 
        int left=0 ;
        int right =0;
        for (int i=0;i<n;i++){
            if(nums[i]>min)
            {    left=i;
                break;
            }
        }
        for (int i=n-1;i>=0;i--){
            if(nums[i]<max)
            {    right=i;
                break;
            }
        }
        if(left>=right)return 0;
        return right-left+1;
    }
}