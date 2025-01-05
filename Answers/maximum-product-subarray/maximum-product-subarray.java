class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prod = 1;
        
        for (int n : nums){
            prod*=n;
            max=Math.max(max,prod);
            if(prod==0)prod=1;
            
        }
        prod=1;
        for (int i=nums.length-1; i>=0;i--){
            prod*= nums[i];
            max=Math.max(max,prod);
            if(prod==0)prod=1;
        }
        return max;
    }
}