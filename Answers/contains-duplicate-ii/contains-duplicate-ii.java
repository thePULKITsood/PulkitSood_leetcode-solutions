class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> set = new HashSet();
        int n = nums.length;
        
        for (int i=0;i<n;i++){
        if(set.contains(nums[i]))return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
            
        }
        return false;
    }
}