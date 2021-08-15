class Solution {
    public int[][] highFive(int[][] items) {
        
        TreeMap<Integer, PriorityQueue<Integer>> map = new TreeMap();
        
        for (int item[] : items ){
            
            if(map.get(item[0])==null)
                map.put(item[0], new PriorityQueue<>());
            
            PriorityQueue<Integer> heap =  map.get(item[0]);
            
            heap.add(item[1]);
            
            if(heap.size()>5)
                heap.remove();
        }
        
        List<int[]> sol = new ArrayList();
        for (int i : map.keySet()){
            
            PriorityQueue<Integer> heap =  map.get(i);
            
            int avg = 0;
            while (heap.size()!=0){
                avg += heap.remove();
            }
            avg/=5;
            
            sol.add(new int []{i,avg});
            
        }
        int [][]ans = new int [sol.size()][];
        return sol.toArray(ans);
        
        
    }
}