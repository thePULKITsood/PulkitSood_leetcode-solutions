class TimeMap {

    class pair {
        String value ;
        int t ;
        
        pair(String val , int t){
            this.value= val;
            this.t = t;
        }
    }
    
    Map<String,ArrayList<pair>> map ;
    /** Initialize your data structure here. */
    public TimeMap() {
        map  = new HashMap <String,ArrayList<pair>> ();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(! map.containsKey(key))
            map.put(key,new ArrayList<pair>());
        
        map.get(key).add(new pair(value,timestamp ));
        
    }
    
    public String get(String key, int timestamp) {
        if (! map.containsKey(key))
            return "";
        
        return binarysearch(map.get(key),timestamp);
        
    }

    protected String binarysearch (ArrayList<pair> list ,int time){
        
        int low = 0 ;
        int high = list.size() -1;
        
        while (low<high)
        {
            int mid = (low+high) >> 1;
            
            if (list.get(mid).t == time) return list.get(mid).value;
            
            if (list.get(mid).t < time){
//                 here we need to check the condition
                if (list.get(mid+1).t > time) return list.get(mid).value;
                
                low = mid+1;
                
            }
            else high = mid-1;
            
        }
        
         return list.get(low).t <= time ? list.get(low).value : "";
    }
}
