class MaxStack {

    Stack<Integer> st ;
    Stack<Integer> maxst;
    /** initialize your data structure here. */
    public MaxStack() {
        st=new Stack();
        maxst=new Stack();
    }
    
    public void push(int x) {
        st.push(x);
        
        if(maxst.isEmpty())
            maxst.push(x);
        
        else {
            int m =Math.max(x,maxst.peek());
            maxst.push(m);
        }
        
    }
    
    public int pop() {
   
            maxst.pop();
        return st.pop();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int peekMax() {
        return maxst.peek();
    }
    
    public int popMax() {
        int max = maxst.peek();
        
        Stack<Integer> temp = new Stack();
        
        while (st.peek()!=max){
            temp.push(st.pop());
            maxst.pop();
        }
        st.pop();
        maxst.pop();
        
        while (temp.size()>0){
            this.push(temp.pop());
        }
        return max;
        
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */