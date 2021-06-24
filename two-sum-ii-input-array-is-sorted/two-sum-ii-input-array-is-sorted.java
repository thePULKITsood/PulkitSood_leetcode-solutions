class Solution {
    public int[] twoSum(int[] n, int t) {
        int l = 0 ;
        int r = n.length - 1;
        while (l<r){
            int ans = n[l] +n[r];
            if (ans == t ) return new int []{l+1,r+1};
            if (ans >t) r--;
            if (ans <t) l++;
            
        }
           return new int []{-1, -1};
    }
}