// Last updated: 5/6/2026, 4:09:25 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        if(n==0)
        return (new int[n]);

        int[] ans = new int[n*2];
        for (int i =0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}