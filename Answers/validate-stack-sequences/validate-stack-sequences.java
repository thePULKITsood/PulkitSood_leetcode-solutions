class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       
        int j = 0 ;
        Stack <Integer> st = new Stack ();
        
        for (int x : pushed ){
            st.push(x); 
            // ik elemnt push kar ke sirf ik hi ni pop karana we have to pop unilt they are similar
            
            while (!st.isEmpty() &&   st.peek() == popped[j])
            
            {
                j++;
                st.pop();            
            }
        }
        return st.empty();
        
    }
}

// algoritm - push --> then pop till we get the pop sequence same then keep pushing and popping 