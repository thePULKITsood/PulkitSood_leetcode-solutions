class Solution {
    public int trailingZeroes(int n) {
        //large value of n makes this problem tricky ! 
        // memory issue and time issue ! 
        // number of times factors of 10 are comming
        // occurances of two will be much larger 
        // then just find the occurances of 5 
       
        int zero =0;
        long power = 5;
        while (n>= power){
            zero+= (n/power);
            power*=5;
        }
        return zero;
    }
}