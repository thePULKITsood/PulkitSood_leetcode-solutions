class MedianFinder {

    // we will allow the left side max heap to store one more element 
    //thus when size == size then return av of both the elements 
    // and otherwise return the top of the left heap
    
    PriorityQueue<Integer> left ;
    PriorityQueue<Integer> right ;
        
    /** initialize your data structure here. */
    public MedianFinder() {
        left =new  PriorityQueue<>((a,b) -> b-a);
        right =new  PriorityQueue<>((a,b) -> a-b);
    }
    
    public void addNum(int num) {
        left.add(num);
        if(left.size()-right.size()>1)
           right.add(left.remove());
        
        else if(left.size()!=0 && right.size()!=0 && (left.peek()>right.peek())){
            left.add(right.remove());
            right.add(left.remove());
        }
        
        
        
    }
    
    public double findMedian() {
        if(left.size()==right.size())return ((left.peek()+right.peek())*.5 );
        else return left.peek();
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */