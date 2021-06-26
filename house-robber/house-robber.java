class Solution {
    public int rob(int[] nums) {
        int N = nums.length;
        if (N == 0) return 0;
        
        int yes[] = new int [N];
        int no[] = new int [N];
        
        yes[N-1] = nums[N-1];
        no[N-1] = 0;
        
        
//         yes[N-2] = nums[N-2] + no [N-1];
//         no[N-2] = yes[N-1];
        
        for (int index = N-2 ; index>=0 ; index -- ){
            yes[index] = no[index + 1 ] + nums[index];
            no[index] = Math.max(yes[index+ 1] , no[index + 1 ]);
        }
        return Math.max(yes[0] , no[0]);
        
    }
    
 
}