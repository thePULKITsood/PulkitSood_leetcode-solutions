class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // max answer can be till n+1; if 1 2 3 4 5 -> answer = 6; n+1 ;
        
        for (int i=0 ; i<n;i++){
            if(nums[i]<=0)
                nums[i]=n+5;
        }
        for (int i=0;i<n;i++){
            int index = Math.abs(nums[i]);
            
            if(index<=n && nums[index-1]>0){
                
                nums[index-1]=-nums[index-1];
            }
        }
        for (int i=0;i<n;i++){
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}