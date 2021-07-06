 // "Use an additional array to record the increment value.
// AND IMPLEMENT IT USING A STACK ONLY NO OTHER DATA STRUCTURE 

class CustomStack {
    
    int s = 0 ;
    int inc [];
     Stack <Integer>  st;
    
    public CustomStack(int maxSize) {
        
        st = new Stack();
        
        s = maxSize;
        inc = new int [s];
        
    }
    
    public void push(int x) {
        if (st.size() < s )
            st.push(x);
        
    }
    
    public int pop() {
        if(st.size()==0)
            return -1;
        
        int index = st.size()-1;
        
        int increment = inc[index];
        inc[index] = 0;
        
        if (index > 0)
        inc[index - 1 ] += increment ;
        
        return st.pop()+increment;
        
        
    }
    
    public void increment(int k, int val) {
        
        int index = Math.min(k-1 , st.size()-1);
        if (index >=0 )
            inc[index]+=val;
        
    }
}



// dont keep a full increment array 

// -- meaning keep and increment array and say ki  is point pe jo increment hai that is for all below this and this elemnt 


// thus when popping we can shift that increment down and

// basically making th e increment operation to  o(1) instead of o (k) and utilising th estack behaviour that is all the elements need to  be poope in order 

