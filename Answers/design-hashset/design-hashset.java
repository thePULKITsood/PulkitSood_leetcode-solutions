class MyHashSet {
     
    class Node {
        int key;
        Node (int k){
            this.key=k;
        }
    }
    int prime;
    LinkedList<Node> [] set ;
    public MyHashSet() {
        prime=769;
        set = new LinkedList[prime];
        
        
    }
    
    public void add(int key) {
        int idx=key%prime;
        if(set[idx]==null)
            set[idx]=new LinkedList();
            
        for(Node n : set[idx]){
            if(n.key==key)return;
        }
        set[idx].add(new Node (key));
        
    }
    
    public void remove(int key) {
          int idx=key%prime;
        if(set[idx]==null)
        return;
        
        for(Node n : set[idx]){
            if(n.key==key){
                set[idx].remove(n);
                return;
            }
        }
        
        
    }
    
    public boolean contains(int key) {
        int idx=key%prime;
        if(set[idx]==null)
        return false;
        
        
         for(Node n : set[idx])
            if(n.key==key)return true;
        
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */