class Solution {
    public int firstMissingPositive(int[] nums) {
        Set <Integer> set = new HashSet();
        for (int i:nums)
            set.add(i);
        
        int n = nums.length;
        for (int i=1 ; i<=n;i++){
            if(!set.contains(i))
                return i;
        }
        return n+1;
        
    }
}