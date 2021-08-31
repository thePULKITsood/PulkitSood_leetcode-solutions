class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        TreeMap <Integer, Integer> map = new TreeMap<>();
        
        for (int t [] : trips){
            map.put(t[1],map.getOrDefault(t[1],0)+ t[0]);
            map.put(t[2],map.getOrDefault(t[2],0)- t[0]);
            
            int sum=0;
            for (int i : map.keySet()){
                sum+=map.get(i);
                
                if(sum> capacity)
                    return false;
            }
        }
        return true;
        
    }
}
// 1 ->2
// 3 -> 3   
// 5-> -2  
// 7-> -3