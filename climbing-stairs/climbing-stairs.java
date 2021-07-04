class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b =1;
        int c = 0;
        for (int i=2 ; i<=n ; i++){
            c=a+b;
            b=a;
            a=c;
        }
        return a;
    }
}
// fn = f(n-1) + f(n-2)