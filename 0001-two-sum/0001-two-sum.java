class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // present
            if (map.containsKey(nums[i])) {
                   ans[0] = map.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            // store
               int diff = target - nums[i];
               map.put(diff, i);
        }
        return ans;
           // get an elemnt
          // see if this exactly is present , then return its index and the index of the
        // number in hashmap;
        // Store target - element in hashmap , and it would contain the prev index

    }
}