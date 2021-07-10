class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        if (matrix.length ==0 || matrix[0].length ==0) return 0;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int mt[][]  = new int [n][m];
        
        for (int i =0;i<n ; i++){
            for (int j=0;j<m ; j++)
            { 
                if (matrix[i][j]=='1')
                    
                    mt[i][j] = 1 + ( i==0 ? 0 : mt [i-1] [j]) ;
                
                    else 
                        mt [i][j]=0;
            }
        }
        
        int max = 0;
        for (int i = 0;i<n ; i++){
            
            max = Math.max( mlh ( mt[i] , mt[i].length) , max);
        }
        return max;
        
        
        
    }
    int mlh (int [] h ,int l ){
        
        int nsl[] = new int[l];
        int nsr[] = new int[l];
        
        //filling nsr
        Stack<Integer> st = new Stack();
        
        for (int i = l-1 ; i>=0 ;i--){
        
            while ( ! st.isEmpty() && h[st.peek()] >= h[i])
                st.pop();
            
            if(st.isEmpty())
                nsr[i] = l;
            
            else nsr [i]=st.peek();
            
            st.push(i);
            
        }
          st = new Stack();
        for (int i = 0 ; i< l  ;i++){
        
            while ( ! st.isEmpty() && h[st.peek()] >= h[i])
                st.pop();
            
            if(st.isEmpty())
                nsl[i]=-1;
            
            else nsl[i]=st.peek();
            
            st.push(i);
            
        }
        int max = 0;
        for (int i = 0 ;i< l ; i++)
         max = Math.max(h[i] * (nsr[i] - nsl[i] -1),max);
        
        return max;
    }
}