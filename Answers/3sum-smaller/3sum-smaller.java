class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int sum = 0; 
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length -2 ; i++){
            int low = i+1;
            int high = nums.length-1 ;
            
            
            while (low<high){
                int cursum  = nums[i]+nums[low] + nums[high];
                if(cursum<target)
                {
                    sum += high - low;
                    low++;
                }
                else 
                    high--;
        }
    }
        return sum ;
}
}
// here we have to understand to return high - low as if the target will be made by 
// low and high so it will also be smaller than target if 
// we consider all elements from high to low at highs place 