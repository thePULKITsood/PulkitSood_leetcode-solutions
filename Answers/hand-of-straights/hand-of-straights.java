class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        int len = nums.length;
        if(len%k!=0)return false;
        
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0)+1);
        
        for (int num : map.keySet()){
            if(map.get(num)==0)continue;
            
            for (int i=k-1;i>=0;i--){
                
                if(!map.containsKey(num+i) || map.get(num+i)<map.get(num))
                return false;
                
                map.put(num+i,map.get(num+i)-map.get(num));
                
            }
        }
        return true;
        
    }
}