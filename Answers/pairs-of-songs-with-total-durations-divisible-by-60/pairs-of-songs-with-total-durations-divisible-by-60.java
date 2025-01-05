class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int ans =0;
        int count[] = new int [60];
        for (int t : time ){
            if(t%60==0)
                ans+=count[t%60];
            
            else {
                ans+= count [60 - t %60];
            }
            count [t%60]++;
        }
        return ans;
    }
}