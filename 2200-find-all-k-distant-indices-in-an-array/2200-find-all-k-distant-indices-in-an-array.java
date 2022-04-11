class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // List<Integer> ans = new ArrayList();
        Set<Integer> ans = new HashSet();
        for (int i=0;i<nums.length ; i++){
            if(nums[i]==key){
                for (int j = Math.max(0,(i-k)) ;j<=  i+k && j<nums.length;j++){
                    ans.add(j);
                }
            }
        }
        List<Integer> ret = new ArrayList(ans);
        Collections.sort(ret);
        return ret;
        
        
    }
}