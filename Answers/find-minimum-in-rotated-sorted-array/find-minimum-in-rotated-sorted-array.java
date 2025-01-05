class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        
        int low = 0;
        int high = n-1;
        while (low < high){
            int mid  = low +(high-low)/2;
            
            if(nums[ mid ] < nums[ high ]) // means value is increasing from mid to high then 
                //so we can not have the pivot from mid to high
                high = mid;
            else // value is not increasing from mid to high so we must have pivot htere 
                low = mid +1 ;
        }
        return nums[low];
        
    }
}