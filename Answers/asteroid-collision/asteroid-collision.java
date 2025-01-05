class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack <> ();
        int i = 0 ;
        
        while (i < asteroids.length)
        {
            int val = asteroids[i];
            
            if (val > 0)
            {
                st.push(val);
            }
                
            else 
            {
                while ( st.size() > 0 && st.peek() <  Math.abs (val) && st.peek()> 0)
                    //means  stack da size > 0 
                    //stack di peek te positive element aa 
                    // it is smaller thean the absolute value of val 
                {
                    st.pop();
                }
                
                if (st.isEmpty() || st.peek()<0)
                {
                     // na value vaddi aa 
                    // na equal aa 
                    
                    // and chotia aapa pop karwa tia 
                    
                    //thus stack de vich sirf -ve values hi ne so push that value ;
                    st.push(val);
                }
                
                else if (st.peek() ==  Math.abs(val))
                {
                    
                    //same value 
                    st.pop();
                    //and dont add
                }
              
                
            }
            
            
            i++;
        }
        
        int [] ans = new int [st.size()];
        
        for(int j = st.size() -1 ;j>=0 ;j--)
        {
            ans[j] =st.pop();
        }
        
        return ans;
        
    }
}