class MyCalendarThree {
    TreeMap<Integer,Integer> map ;
    public MyCalendarThree() {
        map = new TreeMap<>();
        
    }
    
    public int book(int start, int end) {
        map.put(start,map.getOrDefault(start,0)+1);
        
        map.put(end,map.getOrDefault(end,0)-1);
        int max=0;
        int sum=0;
        for(int v:map.keySet()){
           sum += map.get(v);
            max=Math.max(max,sum);
            // if(map.get(v)==0)
            //     map.remove(v);
            
            
        }
        return max;
        
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */