class Solution {
     public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
         
        int len = 0;
         
        for (int i = 0; i < n; i++)
        {
            if (st.peek() != -1 && s.charAt(st.peek()) == '(' && s.charAt(i) == ')')
            {
                st.pop();
                len = Math.max(len, i - st.peek());
            } 
            else
            {
                st.push(i);
            }
        }

        return len;
    }
}