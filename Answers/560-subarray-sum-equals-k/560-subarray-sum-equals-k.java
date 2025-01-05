class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap();
        map.put(0,1);
        int sum = 0;
        int count =0;
        for (int num : nums){
        sum += num;
            
            count += map.getOrDefault(sum-k,0);
            
            map.put(sum,map.getOrDefault(sum,0) + 1 );
            
        }
        return count;
        
    }
}