class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        int l= 0;
        int r=n-1;
        while (l<=r){
        int mid = (l+r)/2;
        
            if(mid%2==0){ // even 
                // 
                if(mid+1<n && nums[mid+1]==nums[mid])
                    l=mid+1;
                else 
                    r=mid-1;
                
            }
            else { // odd
                if(mid-1>=0 && nums[mid-1]==nums[mid])
                    l=mid+1;
                else 
                    r=mid-1;
                
            }
            
            
        }
        return nums[l];
        
        
    }
}
/*

i-> even   and left same -> left is ok  lo = i+1
i-> even and left is diff  -> check for single eement nahi to check for right is same 

if right same high =i-1;

same for i-> odd and 

and i have to run from first to last with conditions for first and last element 


*/