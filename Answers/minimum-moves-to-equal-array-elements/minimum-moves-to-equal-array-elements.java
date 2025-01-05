class Solution {
    public int minMoves(int[] nums) {
//       so the equation we watn is lec * min = sum 
        
//         how to get it add k to all 
        
        // min + k   * len  =  sum + (n-1 *k)
        if (nums==null || nums.length<=1 ) return 0;
        long min =(long) nums[0];
        long sum = 0;
        for (int i = 0 ;i< nums.length ; i++){
            sum +=(long) nums[i];
            min = Math.min(min,nums[i]);
            
        }
        return (int )(sum - min*nums.length);
    }
}

