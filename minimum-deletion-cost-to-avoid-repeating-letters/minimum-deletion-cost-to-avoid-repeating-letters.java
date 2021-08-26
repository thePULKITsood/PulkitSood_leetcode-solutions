class Solution {
    public int minCost(String s, int[] cost) {
        int sum =0;
        for(int i=1; i <cost.length ; i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                //add min
                //remove the minimum and change the value of the min one with the max one 
                if(cost[i]<cost[i-1]){
                    sum+=cost[i];
                    cost[i]=cost[i-1];
                }
                else{
                    sum+=cost[i-1];
                    cost[i-1]=cost[i];
                }
            }
        }
        return sum;
        
        
        
    }
}

//basically i have to change the values 
// 4 6 5 