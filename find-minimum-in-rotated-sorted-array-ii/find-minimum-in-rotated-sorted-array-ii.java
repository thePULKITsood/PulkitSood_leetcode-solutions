class Solution {
    public int findMin(int[] nums) {
      
        // if left ot mid is sorted then ans will be from left = mid + 1 to high 
        
        //else if mid to hig  is sorted ans will be from left ot mid = high 
        
        int n = nums.length;
        if(n==1)return nums[0];
        
        int low = 0;
        int high = n-1;
        
        while (low<high)
        {
            while (low<high && nums[low]==nums[low+1])
                low++;
            
            while (low<high && nums[high]==nums[high-1])
                high--;
            
            int mid = low + (high-low)/2;
            
            if(nums[mid]<nums[high])
                high = mid;
            
            else if (nums[mid]>nums[high])
                low = mid +1 ;
            // else 
            //     high -=1;
            
        }
        return nums[low];
        
    }
}