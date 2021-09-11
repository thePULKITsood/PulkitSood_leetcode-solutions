class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        
        Map<Integer,Integer> [] arr = new HashMap [n];
        for (int i = 0 ; i<n;i++){
            arr[i]=new HashMap<>();
        }
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                
                long diff = (long)nums[i]-(long)nums[j];
                if(diff> Integer.MAX_VALUE || diff< Integer.MIN_VALUE)
                    continue;
                int diffe=(int)diff;
                int ap_ending_on_i=arr[i].getOrDefault(diffe,0);
                int ap_ending_on_j=arr[j].getOrDefault(diffe,0);
                
                ans+=ap_ending_on_j;
                ap_ending_on_i+=ap_ending_on_j+1;
                arr[i].put(diffe,ap_ending_on_i);
            }
        }
        return ans;
    }
}