class MyHashMap {
    // we will create a array of linked list 
    // the linked list will be having key and value so that in case of collission we can 
    //get the correct value;
    
    class Entry {
        int key ;
        int val;
        
        Entry(){};
        Entry(int k,int v){
            key=k;
            val=v;
        }
    }
    
    LinkedList<Entry> []map;
    static int prime ;
    
    public MyHashMap() {
        prime=769;
        map = new LinkedList  [prime];
        
    }
    
    public void put(int key, int value) {
            int idx = key%prime;
            if(map[idx]==null){
                map[idx]=new LinkedList<Entry>();
                map[idx].add(new Entry(key,value));
            }
        else {
            // we have to check if the key is present 
            // if yes then upsate its value 
            
            for (Entry entry : map[idx]){
                if(entry.key==key){
                    entry.val=value;
                    return;
                }
            }
            
            // if not then add the key at last or at front ! 
            map[idx].add(new Entry(key,value));
            
        }
            
        
    }
    
    public int get(int key) {
        int idx = key%prime;
        LinkedList<Entry> entries = map[idx];
        
        if(entries==null) return -1;
        for (Entry entry : entries){
            if(entry.key==key){
                return entry.val;
            }
        }
        
        return -1;
        
        
    }
    
    public void remove(int key) {
        int idx = key%prime;
        if(map[idx]==null)return;
        
        
        Entry toremove =null;
        for (Entry entry : map[idx]){
            if(entry.key==key)
            {
                toremove=entry;
                break;
            }
        }
        if(toremove==null)return;
        map[idx].remove(toremove);
        
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */