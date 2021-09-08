class Solution {
    public int minMoves2(int[] nums) {
           Arrays.sort(nums);
            int n = nums.length;
        
        int i=0;
        int j=n-1;
        int ans=0;
        while (i<j){
            ans+=nums[j]-nums[i];
            j--;i++;
        }
        return ans;
        
    }
}
/*
00168

we have to make 0 nad 8 equal for that we will add x to zero and subtract y from 8 

o+x=8-y 
so they become equal
what we can do is we need the number of steps which is equal to x+y to get that we can do thos 
x+y = 8-0
so basically to get x+y we will subtract the values and get the result 


*/