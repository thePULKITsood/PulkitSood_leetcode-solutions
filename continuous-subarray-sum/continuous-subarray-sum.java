class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
//         set has a flaw as i can not store the index it creates a large number of probles 
//         so i will use map and store the index we see the index of the sum 
//         if it has already a index then we are getting it for the second time 
        
        Map<Integer, Integer> map = new HashMap();
        
        map.put(0,-1);
        
        int sum = 0;
        
        for (int i = 0 ;i< nums.length  ; i++)
        {
            sum += nums[i];
            
            int mod = k==0 ? sum : sum%k ;
            
            int prev = map.getOrDefault(mod,-2);
            
            if(prev != -2){
                if(i-prev > 1 )  // this makes sure the length of the substring is > 1 
                    return true;
            }
            else 
                map.put(mod,i);
        }
        return false;
    }
}