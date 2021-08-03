class Solution {
    public int deleteAndEarn(int[] nums) {
                    
        int sum [] = new int [100001];
        for (int n : nums)
            sum[n]+=n;
        
        for (int i = 2 ;i<100001 ; i++){
            sum[i] = Math.max(sum[i-1] , sum[i-2] + sum[i]);
        }
        return sum[100000];
    }
}