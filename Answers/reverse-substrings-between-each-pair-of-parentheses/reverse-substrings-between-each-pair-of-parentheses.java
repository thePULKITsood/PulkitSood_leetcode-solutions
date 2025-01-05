class Solution {
    public String reverseParentheses(String s) {
        
        Stack<StringBuilder> st = new Stack ();
        
        st.push(new StringBuilder());
        
        for (char ch : s.toCharArray()){
            
            if(ch == '(')
            {
              st.push(new StringBuilder());
            }
            
           else if (ch==')')
            {
            StringBuilder last = st.pop();
                
            st.peek().append(last.reverse());
                
                
            }
            
            else            
            st.peek().append(ch);
        }
        
        
        return st.pop().toString();
    }
}