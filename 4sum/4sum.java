
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<List<Integer>>> set = new HashSet();
        
        // List<List<Integer>> ans = new ArrayList();
        for (int i = 0 ; i< n  ; i++){
            for (int k = i+1 ; k<n ; k++){
                int l = k+1;
                int h = n-1;
                while (l<h){
                    int sum = nums[i] + nums[k] + nums[l] + nums[h];
                    if(sum==target){
                        List<Integer> add = new ArrayList();
                        add.add(nums[i]);
                        add.add(nums[k]);
                        add.add(nums[l]);
                        add.add(nums[h]);
                        
                        set.add(new ArrayList(add));
                        l++;
                        h--;
                    }
                    if(sum>target)
                        h--;
                      else if(sum<target)
                        l++;
                }
            }
        }
         List<List<Integer>> ans = new ArrayList(set);
        return ans;
    }
}
