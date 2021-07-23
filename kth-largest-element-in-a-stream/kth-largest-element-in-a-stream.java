class KthLargest {
    
   PriorityQueue<Integer> heap ;
    int k ; 
    public KthLargest(int k, int[] nums) {
        this.k = k;
        
        heap = new PriorityQueue<>(k);
        
        for (int n : nums){
            add(n);
            
        }
    }
    
    public int add(int val) {
        
        if(heap.size()<k)
            heap.add(val);
        
        else if (val > heap.peek())
        {
            heap.poll();
            heap.add(val);
            
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// make a min heap o f size k 

// and return the last element in th eheap when asked 

// to add element - if the element is bigger then the min element we remove that element and then add the new element 