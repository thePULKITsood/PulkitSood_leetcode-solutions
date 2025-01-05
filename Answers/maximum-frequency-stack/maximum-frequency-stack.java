class FreqStack {
    
    // one map of freq 
    
    // one map of freq vs stack 
    
    
    Map<Integer,Integer> freq;
    Map<Integer,Stack<Integer>> grp ;
    int maxFreq;

    public FreqStack() {
    
        freq=new HashMap();
        grp = new HashMap();
        
    }
    
    public void push(int val) {
        
        int freqOfVal = freq.getOrDefault(val,0)+1;
        freq.put(val,freqOfVal);
        
        if(grp.get(freqOfVal)==null)
            grp.put(freqOfVal,new Stack <Integer> ());
        
        grp.get(freqOfVal).push(val);
        
        maxFreq = Math.max(maxFreq,freqOfVal);
             
        
    }
    
    public int pop() {
        Stack<Integer> st =  grp.get(maxFreq); 
        int ele =st.pop();
        
        if(st.size()==0)
            maxFreq--;
        
        freq.put(ele,freq.get(ele)-1);
        
        return ele;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */