class Solution {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
}
// choose x such that x is a factor of n  -->x % n == 0
// n = n-x;
//when does a player win when there are no factors of n-x  -- >meaning  n==1 only then the game stops 

