class Solution {
    public int missingNumber(int[] nums) {
        
        
        
        
        
        
        
        
        int sum  = 0;
        for (int n :nums )sum +=n;
        int len = nums.length + 1;
        int expected =  len*(len-1) /2;
        
        return expected - sum;
        
        
//         Arrays.sort(nums);
//         int a = 0;
//         for (int i = 0 ;i< nums.length;i++){
//             if (a!=nums[i])return a;
//             a++;
            
//         }
//         return a++;
    }
}
//comment 