class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> ans = new ArrayList();
        List<Integer> small = new ArrayList();
        
        func(ans,small,target,0,nums,0);
        
        return ans;
    }
    
    void func (List<List<Integer>> ans ,List<Integer> small, int target,int sum  ,int nums[],int idx  ){
        
        if(sum==target){
            ans.add(new ArrayList(small));
            return;
        }
        else if (sum>target){
            return;
        }
        else{
            
            //call for the same index 
            
//                 sum+=nums[idx];
//                 small.add(nums[idx]);
                
//                 func(ans,small,target,sum,nums);
                
//                 small.remove(small.size()-1);
//                 sum-=nums[idx];
            
            //call for all other indexes
            
           for (int i = idx;i<nums.length;i++){
                sum+=nums[i];
                small.add(nums[i]);
                
                func(ans,small,target,sum,nums,i);
                
                small.remove(small.size()-1);
                sum-=nums[i];
            }
            
        }
    }
}