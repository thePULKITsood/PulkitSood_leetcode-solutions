class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st  = new Stack ();
//         we will make an array or map of indexes where we will store the things which are not to be added in the final string 
        
        for (int i = 0; i< s.length() ; i++){
            
            char ch = s.charAt(i);
            if (ch=='('){
                st.push(i);
            }
            
            else if (ch==')'){
                if (st.isEmpty())
                    st.push(i);
                else if (s.charAt(st.peek()) =='(')
                {
                    st.pop();
                }
                else st.push(i);
            }
            
        }
        Set<Integer> indexesToRemove = new HashSet<>();
         while (!st.isEmpty()) indexesToRemove.add(st.pop());
                StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!indexesToRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        
    }
}
