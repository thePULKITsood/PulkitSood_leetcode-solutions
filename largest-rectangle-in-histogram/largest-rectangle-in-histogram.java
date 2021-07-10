class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length;
        
        int left [] = new int [n]; // next smaller to left 
        
        int right []= new int [n];  // next smaller to right 
        
        Stack<Integer> st = new Stack();
    
        
        for (int i = n - 1 ; i>=0 ;i--)
        {    
            while (!st.isEmpty() && height[st.peek()] >= height[i] )
            st.pop();
         
            
            if (st.isEmpty())
            right[i] = n;
            
            else
                right [i]=st.peek();
            
                st.push(i);
        }
        
        st = new Stack();
        
               for (int i = 0 ; i<n ;i++)
        {    
            while (!st.isEmpty() && height[st.peek()] >= height[i] )
            st.pop();
         
            
            if (st.isEmpty())
            left[i] = -1;
            
            else
                left [i]=st.peek();
            
                st.push(i);
        }
        
        int maxarea = 0;
        for (int i = 0 ; i< n ; i++){
            maxarea = Math.max(maxarea , height[i]*(right[i] - left[i] -1 ));
        }
        return maxarea;
    }
    
//     i have to find the next smalleer to the left and next smaller to the right 
    
}