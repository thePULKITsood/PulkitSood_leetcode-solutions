class Solution {
    Integer memo[][] = null;
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length ;
        int m = nums2.length ;
        
         memo = new Integer [n+1][m+1];
        return func(0,0,nums1,nums2);
    }
    int func (int i , int j,int[] nums1, int[] nums2 )
    {
        
        
        if (i== nums1.length || j == nums2.length) return 0;
        
        if (memo[i][j] !=null) return memo[i][j];
        
        if (nums1[i] == nums2[j])
            return memo[i][j] = 1 + func (i+1 , j+1 , nums1 , nums2);
        
        else {
            
            // int delboth  = func (i+1 , j+1 , nums1 , nums2 ,memo);
            int del1 = func (i+1 , j , nums1 , nums2 );
            int del2 = func (i , j+1 , nums1 , nums2 );
            
            return memo[i][j] = Math.max(del1 , del2);
            // Math.max ( delboth ,
        }
    }
}