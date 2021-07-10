class Solution {
    class pair{
        char c ;
        int count ;
        pair (char c , int count ){
            this.c = c ;
            this.count = count ;
        }
    }
    public String removeDuplicates(String s, int k) {

        Stack <pair> st = new Stack ();
        
        for (char ch : s.toCharArray() )
        
        {
            if (st.isEmpty () || st.peek().c != ch){
                
                st.push(new pair (ch , 1 ) );
            }
            else if (st.peek().c == ch){
                
                st.peek().count ++;
                if (st.peek().count == k)
                    st.pop();
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        for (pair p :st){
            int count = p.count ;
            char ch = p.c;
            
            while (count-->0)
                sb.append(ch);
        }
        return sb.toString();
        
        
        
    }
}