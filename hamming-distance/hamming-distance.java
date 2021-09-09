class Solution {
    public int hammingDistance(int x, int y) {
        return findzeros(x^y);
        
    }
    int findzeros(int a){
        int zeros=0;
        while(a>0){
            if(a%2==1)
                zeros++;
            a/=2;
        }
        return zeros;
    }
}