class Solution {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        int ans=0;
        while (result>0){
            ans+=1;
            result = result & (result-1);
        }
        return ans;
        
    }
}