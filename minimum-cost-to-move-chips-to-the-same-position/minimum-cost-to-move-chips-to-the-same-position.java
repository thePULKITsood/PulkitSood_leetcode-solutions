class Solution {
    public int minCostToMoveChips(int[] position) {
        
        // i+2 to i-2 with cost -> 0
        // i+1 to i-1 with cost -> 1 
        
        // find the highest one 
        // then move to it -> move closest with cost 0 -> 
        // then the cost will be either 0 or 1 
        int even =0;
        int odd=0;
       for (int i:position){
         if(i%2==0)
             even ++;
           else
               odd++;
       }
        return Math.min(even,odd);
    }
}