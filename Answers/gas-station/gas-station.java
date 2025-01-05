class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int balance = 0 ; 
        
        int n = gas.length;
        int fuel = 0;
        int start = 0;
        for (int i = 0 ;i< n ; i++){
            
            fuel +=gas[i];
            fuel-=cost[i];
            
            if (fuel<0){
                balance +=fuel;
                fuel=0;
                start = i+1;
                
            }
            
            
        }
        if (fuel+balance >= 0){
            return start;
            
        }
        else return -1 ;
        
    }
}

