class TwoSum {
    private HashMap<Integer, Integer> num_counts;

    /** Initialize your data structure here. */
    public TwoSum() {
        this.num_counts = new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        this.num_counts.put(number, num_counts.getOrDefault(number, 0) + 1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
         for(Integer key : this.num_counts.keySet()) {
            int complement = value - key;
             
            if(complement != key) {
                if(this.num_counts.containsKey(complement))
                    return true;
                
            } 
             else if(this.num_counts.get(key) > 1)
                return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */