class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        
        for (int i = 0 ; i< nums.length - 2 ; i++){
            if (i==0 || nums[i] != nums[i-1]) // removing duplicates 
                twosum(nums,i,ans);
        }
        return ans;
        
    }
    void twosum (int[]nums , int i , List<List<Integer>> ans){
        int low = i+1 ;
        int high = nums.length -1 ;
        while (low<high){
            int sum = nums[low]+nums[high] + nums[i];
            if (sum==0)
            {
                List<Integer> add = new ArrayList();
                add.add(nums[i]);
                add.add(nums[low]);
                add.add(nums[high]);
                ans.add(new ArrayList(add));
                
                // removing the similar integers 
                while (low< high && nums[low] == nums[low + 1])
                    low++;
                
                low++;
                high--;
            }
            if(sum<0)
                low++;
            else if (sum>0)
                high--;
            
        }
    }
}