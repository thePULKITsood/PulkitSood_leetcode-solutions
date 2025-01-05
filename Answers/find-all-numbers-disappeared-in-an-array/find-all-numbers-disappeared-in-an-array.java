class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums ){
            int idx = Math.abs(i);
            if(nums[idx-1]>0)
                nums[idx-1]*=-1;
        }
        List<Integer> list = new ArrayList();
        
        for (int i=1;i<=nums.length;i++){
            if(nums[i-1]>0)
                list.add(i);
                // nums[i]*=-1;
        }
        return list;
        
    }
}