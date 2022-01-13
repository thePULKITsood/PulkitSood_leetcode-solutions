class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int time [] = new int [1001];
        
        for (int t [] : trips){
            
            time[t[1]]+= t[0];
            time[t[2]]-= t[0];
        }
            int sum=0;
            for (int i : time){
                sum+= i;
                
                if(sum> capacity)
                    return false;
            }
        
        return true;
        
    }
}
// 1 ->2
// 3 -> 3   
// 5-> -2  
// 7-> -3