class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int other[] = new int [n];
        for (int i=0;i<n;i++){
            other[i]=nums[i];
        }
        Arrays.sort(other);
        
        int l=0;
        int r=n-1;
        int right=0;
        while (l!=n && other [l]==nums[l]){
            l++;
        }
        
        
        while ( r >= 0 && other [r]==nums[r]){
            r--;
            right ++;
        }
        int ans=n;
        ans -=l;
        ans-=right;
        return ans<0 ? 0:ans;
        
        //sliding window approach
        /*
        
        make a left and right 
        make a min and max 
        now if left<=min
        left ++
        */
        
    }
}