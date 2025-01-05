class RandomizedCollection {
    Map <Integer,Set<Integer>> map;
    ArrayList<Integer> list ;
    
    public RandomizedCollection() {
        
       list = new ArrayList();
        map = new HashMap<Integer,Set<Integer>>();
        
    }
    
    public boolean insert(int val) {
        if(! map.containsKey(val))
            map.put(val,new HashSet<>());
        
        map.get(val).add(list.size());
        list.add(val);
        
        return map.get(val).size()==1;
        
    }
    
    public boolean remove(int val) {
        if(! map.containsKey(val) || map.get(val).size()==0)return false;
            
        
//         int toremoveidx = map.get(val).iterator().next();
        
//         int lastidx = list.size()-1;
//         int lastdigit = list.get(lastidx);
        
//         list.set(toremoveidx , lastdigit);
        
//         map.get(lastdigit).remove(lastidx);
        
//         map.get(lastdigit).add(toremoveidx);
        
//         map.get(val).remove(toremoveidx);
        
//         list.remove(list.size()-1);
        
//         return true;
        if(!map.get(val).contains(list.size()-1)) {
            int currPos = map.get(val).iterator().next();
            int lastVal = list.get(list.size() - 1);
            map.get(lastVal).remove(list.size() - 1);
            map.get(lastVal).add(currPos);
            map.get(val).remove(currPos);
            map.get(val).add(list.size() - 1);
            list.set(currPos, lastVal);
        }
        map.get(val).remove(list.size()-1);
        if(map.get(val).isEmpty()) map.remove(val);
        list.remove(list.size()-1);
        return true;
        
        
    }
    
    public int getRandom() {
         int max = list.size();
        int min = 0;
        int ind = (int)(Math.random()*(max-min) + min);
        return list.get(ind);
        
        
    }
}

