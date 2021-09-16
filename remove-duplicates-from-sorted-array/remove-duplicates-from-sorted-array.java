class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int n = nums.length;
        while (j<n-1){
            if(nums[j]==nums[j+1]){
                j++;
            }
            else {
                nums[i++]=nums[j++];
            }
        }
        if(j<n)
        nums[i++]=nums[j++];
        return i;
        
    }
}