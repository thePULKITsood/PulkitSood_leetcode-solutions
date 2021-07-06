class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length ;
        int j = 0 ;
        
        Stack <Integer> st = new Stack ();
        
        for (int x : pushed ){
            st.push(x);
            
            // ik elemnt push kar ke sirf ik hi ni pop karana we have to pop unilt they are similar 
            while (!st.isEmpty() &&  j< n && st.peek() == popped[j])
            
            {
                j++;
                st.pop();            
            }
        }
        return j==n;
        
    }
}