class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int r=0;
        int len =nums.length;
        
        int sum =0;
        int max=0;
        HashMap<Integer,Integer> map = new HashMap();
        
        while (r<len){
         sum+=nums[r];
            int count = map.getOrDefault(nums[r],0);
            map.put(nums[r],++count);
        
            while (map.get(nums[r]) > 1  && l < r ){
                
              map.put(nums[l],
                             map.get(nums[l])-1);
                
             sum-=nums[l];
             
            l++;
         }
            r++;
            max=Math.max(max,sum);
            
            
        }
        return max;
        
    }
}