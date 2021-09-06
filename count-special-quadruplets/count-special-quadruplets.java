class Solution {
    public int countQuadruplets(int[] nums) {
     // Arrays.sort(nums);
     HashMap<Integer,Integer> map = new HashMap();
        for (int i : nums)
            map.put(i ,map.getOrDefault(i,0)+1);
        
        int ans=0;
        int n = nums.length;
        for (int m=0;m<n-3;m++){
        for (int i=m+1;i<n-2 ; i++){
          for (int j=i+1;j<n-1 ; j++){
           for (int k=j+1;k<n ; k++){
           if(nums[m]+nums[i]+nums[j]==nums[k])
               ans++;
           }
           }
          }   
        }
        return ans;
    }
}