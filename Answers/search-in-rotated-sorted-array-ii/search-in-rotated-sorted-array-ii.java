class Solution {
    public boolean search(int[] nums, int target) {
        
        // check if left is sorted 
        
        // yes - check target is in bounds - move high = mid -1 
            // no = move low = mid +1 
            
            //if left not sorted then right is sorted 
            
            //check if target in bounds - low = mid +1
            //if no h = mid -1 
    
        int n = nums.length;
        if(n==1)return nums[0] == target ;
  
        int low = 0;
        int high = n-1;
        
        while (low <= high){
            // avoid duplicates 
            
            while (low<high && nums[low] == nums[low+1])
                low++;
            
            while (low<high && nums[high] == nums[high-1])
                high--;
            
            int mid = low+(high-low)/2;
            
            if(nums[mid]==target)
                return true;
            
            if(nums[mid]>=nums[low]){
                
                if(target>=nums[low] && target<nums[mid])
                    high= mid-1;
                else 
                    low = mid+1;
                
            }
            else {
                if(target>nums[mid] && target<=nums[high])
                    low= mid+1;
                else 
                    high = mid-1;
                
            }
        }
        return false;
    }
    
}