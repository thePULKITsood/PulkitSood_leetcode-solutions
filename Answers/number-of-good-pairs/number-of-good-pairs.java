class Solution {
    public int numIdenticalPairs(int[] nums) {
int arr[] = new int [101];
        for (int i:nums){
            arr[i]++;
            
        }
        int ans =0;
        
        for (int i:arr){
            if(i>1)
            {
                ans+= i *(i-1) /2;
            }
        }
        return ans;
        
    }
}
