class Solution {
    List<List<Integer>> ans = new ArrayList();
    int len ;
    public List<List<Integer>> subsets(int[] nums) {
        len = nums.length;
        
        func(0,new ArrayList() , nums);
        return ans;
    }
   void func ( int idx,ArrayList<Integer> mini , int []nums ){
        if(idx==len)
        {
            ans.add(new ArrayList(mini));
            return ;
        }
        // dont add
        func(idx+1,mini,nums);
        // add
        mini.add(nums[idx]);
        func(idx+1,mini,nums);
        mini.remove(mini.size()-1);
    }
}