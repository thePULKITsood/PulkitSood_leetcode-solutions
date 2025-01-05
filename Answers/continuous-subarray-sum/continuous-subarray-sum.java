class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, List<Integer>>map = new HashMap();
        map.put(0,new ArrayList());
        map.get(0).add(-1);
        
        
        int sum =0;
        int rem =0;
        
        for (int i =0 ;i<nums.length ; i++)
        {
            sum +=nums[i];
            rem = sum%k;
            
            if(rem<0)
                rem+=k;
            
            if(map.containsKey(rem))
            {  for (int val : map.get(rem))
                if(i-val>=2)
                return true;
            }
        
            else if(! map.containsKey(rem))
                map.put(rem,new ArrayList());
            
            map.get(rem).add(i);
        
            
        }
        return false;
    }
}