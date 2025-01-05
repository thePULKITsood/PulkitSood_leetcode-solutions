class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack ();
        int a ,b;
        
        for (String s :tokens){
            if (s.equals("+")){
            a=st.pop();
           b= st.pop();     
                
                st.push(a+b);
            }
            else if (s.equals("-")){
           a=st.pop();
           b= st.pop();     
                
                st.push(b-a);
            }
            else if( s.equals("*")){
          a=st.pop();
           b= st.pop();     
                
                st.push(b*a);
                
            }
            else if (s.equals("/")){
           a=st.pop();
           b= st.pop();     
                
                st.push(b/a);
                
            }
            else {
                int num = Integer.parseInt(s);
                st.push(num);
            }
        }
        return st.pop();
        
    }
}