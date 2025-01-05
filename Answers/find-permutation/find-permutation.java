class Solution {
    public int[] findPermutation(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack();
        int ans []= new int [n+1];
        int index=0;
        int i=0;
        for (;i<n;i++){
            
            st.push(i+1);
            if(s.charAt(i)=='I'){
                while(!st.isEmpty())
                  ans[index++]=st.pop();
            }
        }
        st.push(i+1);
        while(!st.isEmpty())
                ans[index++]=st.pop();
        // return list.toArray(new int [list.size()]);
       return ans;        
    }
}