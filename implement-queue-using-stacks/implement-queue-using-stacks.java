class MyQueue {
    Stack<Integer> stpush ;
    Stack<Integer> stpop;

    public MyQueue() {
        stpush=new Stack();
        stpop=new Stack();
    }
    
    public void push(int x) {
        
        stpush.push(x);
    }
    
    public int pop() {
        if(stpop.isEmpty()){
            while (!stpush.isEmpty())
            stpop.push(stpush.pop());
        }
        return stpop.pop();
        
    }
    
    public int peek() {
         if(stpop.isEmpty()){
            while (!stpush.isEmpty())
            stpop.push(stpush.pop());
        }
        return stpop.peek();
        
    }
    
    public boolean empty() {
        
        return stpush.isEmpty() && stpop.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */