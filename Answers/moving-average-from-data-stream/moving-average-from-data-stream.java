class MovingAverage {
    Queue <Integer> q;
    int maxsize = 0;
    double sum = 0;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        q = new LinkedList ();
        maxsize = size;    
    }
    
    public double next(int val) {
        
        sum += val;
        q.add(val);
        
        if( q.size() > maxsize ){
            sum -= q.remove();
        }
        
        return sum/q.size();
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */