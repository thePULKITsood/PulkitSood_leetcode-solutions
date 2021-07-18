class RandomizedSet {

//     hashmap will store value to index 
//     arraylist will store value and the index will be sotred by the hashmap for each value 
    
    Map<Integer,Integer>map ;
    ArrayList<Integer>list;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        map = new HashMap();
        list= new ArrayList();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        
            list.add(val);
        map.put(val,list.size()-1);
        return true;
            
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(! map.containsKey(val)) return false;
        int index = map.get(val);
        
//         swap the values
        swap(index,list.size()-1);
        
        map.put(list.get(index),index);
        
        list.remove(list.size()-1);
        map.remove(val);
        
        return true;
        
    }
    protected void swap(int i , int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int max = list.size();
        int min = 0;
        int ind = (int)(Math.random()*(max-min) + min);
        return list.get(ind);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

// i can store value in hashmap and index in array list
 //or opposite i can store index in hashmap and value in arraylist 
//for delete i will swap with the last element and then the pop function will work in constant time 
