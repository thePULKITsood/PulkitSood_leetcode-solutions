class Solution {
    public int minSteps(int n) {
        int ans =0;
        int d=2;
        while (n>1){
            while (n%d==0){
                ans+=d;
                n/=d;
            }
            d++;
        }
        return ans;
        
    }
}

/*

1 
2 -> 1+1 
3->  2+1  
5 -> 2+3
6 ->3+3

7->  i have to make it by ones only 

1 -> 1 
2-> 2 
3-> 3 
4- > 2+2 
5-> 5 
6-> 3+3 
7-> 7 
8 -> 4+4 (4*2)
9->3+3+3  (3*3)
10->5+5  (5*2)
*/