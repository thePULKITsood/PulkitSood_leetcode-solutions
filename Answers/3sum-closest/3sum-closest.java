class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int result = nums[0]+nums[1] + nums[2];
        
        Arrays.sort(nums);
        
        for (int first = 0 ; first < nums.length -2 ; first ++){
            
            int second  = first +1 ;
            int third = nums.length -1 ;
            
            while (second < third ){
                
                int cursum = nums[first]+nums[second]+nums[third];
                
                 if(cursum == target) return cursum;
                
                  else if (Math.abs(target-cursum) < Math.abs(target-result))
                    result = cursum;
                
                if(cursum>target)
                    third--;
                else if (cursum< target)
                    second++;
            }
        }
        return result;
    }
}