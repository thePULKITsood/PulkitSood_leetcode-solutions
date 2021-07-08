class Solution {
    public String removeKdigits(String num, int k) {
        LinkedList <Character> st = new LinkedList();
        
        for (char c : num.toCharArray()){
            //case 1 - we remove oll the big candidates from the top of the stack
            
            while (st.size ()>0 && k > 0 && st.getLast()> c)
            {
                st.removeLast();
                k--;
            }
            
            // now we have popped the elements and now we add our current element 
            st.addLast(c);
        }
        
        // now we are done we must remove the remaining digits from the  tail 
        // as now we are having a monotonic increasing array 
        
        while (k>0){
            st.removeLast();
            k--;
        }
        
        // now building the fincal result 
        StringBuilder sb = new StringBuilder ();
        boolean leadingZero = true;
        for (char ch : st )
        {
            
         if(leadingZero && ch == '0') 
         {
           
             continue;
         }
            leadingZero = false;
            sb.append(ch);            
        }
      
        if (sb.length() == 0 )return "0";
        return sb.toString();
    }
}