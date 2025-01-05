class Solution {
    public int twoEggDrop(int n) {
        return (int) Math.ceil ( (-1 + Math.sqrt(1+8*n))/2.0);
    }
}
/*
x^2  + x -2n >=0;

d = b^2 - 4ac 
d = 1- 4 * - 2n * 1 
    
    -b +- (sqrt(d))/2.0
    
    */