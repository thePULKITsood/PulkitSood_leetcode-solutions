class Solution {
    public int[] nextGreaterElements(int[] num) {
        
        // we have to go from left to right 
        
        // the answer is made by the one who makes the  pop 
        // i will just make two loops and if the st.peek()== i then its ngr = -1 
           
        
        int n  = num.length;
 
        int ans [] = new int [n];
        Arrays.fill(ans,-1);
        
        Stack<Integer> st = new Stack();
        
        for (int i = 0 ;i < 2*n ; i++ ){
            int idx = i%n;
            
            while (!st.isEmpty() && num[st.peek()]< num[idx]) 
                ans[st.pop()] = num[idx];
            
//             if (num[st.peek()] == num[idx])
//                 ans[]
            st.push(idx);
            
        }
        return ans;
            
        
    }
}