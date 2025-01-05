class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target)  {
        Arrays.sort(nums);
        
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
            
        
                for (int i = idx;i<nums.length;i++){
              if(i==idx || nums[i]!=nums[i-1]){
                sum+=nums[i];
                small.add(nums[i]);
                
                func(ans,small,target,sum,nums,i+1);
                
                small.remove(small.size()-1);
                sum-=nums[i];
            }

                }
            

        }
        
    }
}