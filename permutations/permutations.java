class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> small = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        func(nums,visited,ans,small);
        
        return ans;
        
    }
    void func(int nums[] , boolean [] visited, List<List<Integer>> ans ,List<Integer> small){
      
        if(small.size()==nums.length)
       {
          ans.add(new ArrayList(small));
          return;
       }
       
        for (int j=0;j<nums.length ; j++){
            
         if(visited[j]==false){
             
                visited[j]=true;
                small.add(nums[j]);
             
                func(nums,visited,ans,small);
             
                small.remove(small.size()-1);
                visited[j]=false;
            }
        }
        
        
    }
}