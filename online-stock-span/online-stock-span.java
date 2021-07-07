
// basically we need to find the next greater elemnt on the left and then we will return the index - index of htat element 

// next greater element on the left os to be found 
class StockSpanner {

    class pair {
        int val;
        int i ; 
        pair (int val , int i ){
            this.val=val;
            this.i=i;
        }
    }
    Stack<pair> st;
    int index ;
    
    public StockSpanner() {
        
        st = new Stack();
        index = 1;
    }
    
    public int next(int price) {
        
      
        
        while (!st.isEmpty() && st.peek().val <= price )
            st.pop();
        
        int ans = 0;
        
        if (st.isEmpty())
            ans= index;
        else
        {
            int in = st.peek().i;
            ans= index-in;
        }
        
        st.push(new pair(price , index++));
        
        return ans;
     
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */