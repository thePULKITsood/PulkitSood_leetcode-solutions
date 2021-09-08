class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
    
//         long sum =0;
        
//         for (int i:nums)
//         sum+=i;
        
        int n = nums.length;
        // sum/=n;
        int med = nums[n/2];
        // int ans=0;
        int ans2=0;
        for (int i:nums){
            // ans+=Math.abs(sum-i);
            ans2+=Math.abs(med-i);
                
        }
        // return Math.min(ans,ans2);
        return ans2;
    }
}
/*
// 1 sort 
// then as we watn to bring all the elements to equal point we 
//increase the first element and decrease the last element so theat theya re at equal point 
// example 1 2 9 10 
5 4 3 4 
// 1 -> 5  = 4 
// 10 -> 5  = 5 
//     total inc decrease is equal to 10 -1 

1 2 6 9 10 
    
    */