
// basically we need to find the next greater elemnt on the left and then we will return the index - index of htat element 

// next greater element on the left os to be found 
class StockSpanner {

    Stack<Integer> st;
    Map <Integer,Integer>map; 
    int index ;
    public StockSpanner() {
        st = new Stack();
        map = new HashMap();
        index = 1;
    }
    
    public int next(int price) {
        
        map.put(price , index);
        
        while (!st.isEmpty() && st.peek()<= price )
            st.pop();
        
        int ans = 0;
        if (st.isEmpty())
            ans= index;
        else {
            int i = map.get(st.peek());
            ans= index-i;
        }
        st.push(price);
        index ++;
        return ans;
        
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */