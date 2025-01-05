class FirstUnique {
    Queue<Integer> q = new LinkedList();
    HashMap<Integer,Boolean> isUnique = new HashMap();

    public FirstUnique(int[] nums) {
    
        for (int i: nums){
            this.add(i);
            
        }
    }
    
    public int showFirstUnique() {
        //remove all the non unique values from the start of the Q
        
       while (!q.isEmpty() && !isUnique.get(q.peek()))
           q.remove();
        
        
        if(!q.isEmpty())
            return q.peek();
        
        return -1;
        
    }
    
    public void add(int value) {
        
        
        if(isUnique.containsKey(value)){
                isUnique.put(value,false);
            }
            else {
                // we only add to the q unique values to make the q smaller
                
                isUnique.put(value,true);
                q.add(value);
            }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */