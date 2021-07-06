class Solution {
    public int[] nextGreaterElements(int[] nums) {
     
        // loop 1 - n-2 to 0    - only tow operations pop and poush  not making answer 
            
        // loop 2 - n-1 to 0 - the actual   pop   - ans -- push 
            
        int n = nums.length;
        Stack <Integer> st = new Stack ();
        
        int ans[] = new int [n];
        for (int i = n-2 ; i >=0 ; i--){
//             pop push  - no ans 
            
            while (! st.isEmpty() && st.peek() < nums[i])
                st.pop();
            
            st.push(nums[i]);
        }
        
        
        
        
        
             for (int i = n-1 ; i >=0 ; i--){
//             pop   ans  push  
            
            while (! st.isEmpty() && st.peek() <= nums[i])
                st.pop();
            
                 
                 ans[i] = st.size()== 0 ? -1 : st.peek();
                 
                st.push(nums[i]);
        }
        return ans;
    }
}

// what we did we processed all the elements from last to front  without making the answer then we did the same thing 
// we made our answer from the right to the left 

// int the first pass we dont make the answer as the answer will be wrong thus we directyly  make the answer in
// the next pass 