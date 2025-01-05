class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList();
        for (int i=0;i<n;i++)
            q.add(i);
        
        int ans []=new int [n];
        for (int i:deck){
            ans[q.remove()]=i;
            if(q.size()>0)
                q.add(q.remove());
            
        }
        return ans;
        
        
    }
}
/*
1. two populations of cards 
all the small ones are at the odd places for the 

[2,13,3,11,5,17,7] -> 7 7/2+1 - cards sorted 
 0    2    4    6
 
 left 13 11 17 
 
 sort 
 2 3 5 7 - 11 13 17  

some sorting arrangement that makes 11 13 17 
 11  13  17
 13 11 17
 
 3 elements 
 
 small large medium 
 
 
 6 elements 
 
  2  13  3  10  7   
  2 3 7 13 10
  
  2 4 8 4 2 
  
  0 2 4 6 
  0 4 8 16 
*/