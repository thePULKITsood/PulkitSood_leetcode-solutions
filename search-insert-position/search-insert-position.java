class Solution {
    public int searchInsert(int[] nums, int target) {
        int n =nums.length;
        int l=0;
        int r=n-1;
        while (l<r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]>target) r = mid-1;
            else  l = mid+1;
        }
        if(target> nums[l])return l+1;
        return l;
        
    }
}