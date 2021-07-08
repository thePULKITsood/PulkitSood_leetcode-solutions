class Solution {
    public String decodeString(String s) {
        
        // will be done using a pointer  and a string to duplicate 
        
        Stack <Character> st = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray())
        {
            if (Character.isDigit(ch))
               st.push(ch);
           
            else if (st.size()==0)
                  sb.append(ch);
            
           else {
               
                st.push(ch);
                
                if (ch == ']')
                {
                    st.pop();
                    StringBuilder part  = new StringBuilder();
                    
                    while (st.size() >0  && st.peek()!='[')
                        part.append(st.pop());
                    
                    part = part.reverse();
                        
                    st.pop();
                    // popping the [
 
                    
                    ArrayList<Integer> num = new ArrayList();
                    
                    while (st.size()>0  && Character.isDigit( st.peek() ) )
                         num.add(st.pop()-'0');
                    
                    
                    int mul= 0 ;
                    
                    for (int i = num.size() -1 ; i>=0 ; i--){
                    mul= mul*10 +  num.get(i);    
                    }
                    
                    
                    StringBuilder toadd  = new StringBuilder();
                   while (mul -- > 0)
                     toadd.append(part);    
                
                    if (st.size()==0)
                        sb.append(toadd);
                    else{         
                        String str = toadd.toString();
                        for (char c : str.toCharArray() ){
                            st.push(c);
                        }
                    }
                }
              
            }
            
        }
        
        for (char ch : st){
            sb.append(ch);
        }
        return sb.toString();
        
    }
}