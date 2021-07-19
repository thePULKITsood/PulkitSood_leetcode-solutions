class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        // Set<List<List<Integer>>> set = new HashSet();
        
        List<List<Integer>> ans = new ArrayList();
        
        for (int i = 0 ; i< n  ; i++){
            
            for (int j = i+1 ; j <n ; j++){
                
                int l = j+1;
                int h = n-1;
                
                while (l<h)
                {
                    int sum = nums[i] + nums[j] + nums[l] + nums[h];
                
                    if(sum==target){
                        List<Integer> add = new ArrayList();
                        add.add(nums[i]);
                        add.add(nums[j]);
                        add.add(nums[l]);
                        add.add(nums[h]);
                        
                        ans.add(new ArrayList(add));
                        
                        // remove all the duplicates 
                        
                        while (l<h && nums[l]== add.get(2)) l++;
                        
                        while (l<h && nums[h]== add.get(3)) h--;
                        
                       
                    }
                    if(sum>target)
                        h--;
                    else if(sum<target)
                        l++;
                }
                //now we will move the j pointer
//                 the main thing is moving the j pointer after one while loop is done 
                
                while (j+1<n && nums[j+1] == nums[j]) j++;
            }
             while (i+1<n && nums[i+1] == nums[i]) i++;
        }
         // List<List<Integer>> ans = new ArrayList(set);
        return ans;
    }
}