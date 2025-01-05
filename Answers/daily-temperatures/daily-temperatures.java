class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        
        Stack <Integer> st = new Stack ();
        
        int ans [] = new int [n];
        
        // st.push( n-1 );
        // ans[n-1] = 0;
        
        for (int i = n-1 ; i>=  0 ; i--)
        {
            while (st.size () >0  && t[i] >=t[st.peek()])
                st.pop();
            
            if (st.size ()==0)
                ans[i]=0;
            
            else 
                ans[i]=st.peek()-i;
            
            st.push(i);
        }
        
        return ans;
    }
}