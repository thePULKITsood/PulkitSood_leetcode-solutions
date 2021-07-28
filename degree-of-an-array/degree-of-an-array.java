class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer , Integer> count = new HashMap();
        HashMap<Integer , Integer> first = new HashMap();
        
        int degree = 0 ;
        int min = 0;
        
        for (int i = 0 ;i< nums.length ; i++){
            first.putIfAbsent(nums[i] , i);
            
            count.put(nums[i] , count.getOrDefault(nums[i] , 0) + 1 );
            
            if(count.get(nums[i]) >degree){
                
                degree = count.get(nums[i]) ;
                min = i-first.get(nums[i]) + 1 ;
                
            }
            else if (count.get(nums[i]) == degree){
                min = Math.min(min, i - first.get(nums[i]) +1 );
            }
            
        }
        return min;
    }
}