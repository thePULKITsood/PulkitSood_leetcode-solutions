class Solution {
    public String smallestSubsequence(String s) {
       
        Stack<Character > st = new Stack ();
        boolean seen [] = new boolean [26];
        int count [] = new int [26];
        
        for (char ch : s.toCharArray()){
            
            count [ch-'a'] ++;
        }
        
        
        for (char ch : s.toCharArray()){
        
            count[ch-'a'] -- ;
            
            if (seen[ch-'a']) continue;
            
//             now the least letter 
            // --> when can we remove it - it is > ch and not the last occurance
            
                while (st.size()>0 && st.peek()> ch &&  count[st.peek() -'a'] > 0 )
                {
                    char rem= st.pop();
                    seen[rem-'a'] = false;
                    
                }
            
            st.add(ch);
            seen[ch-'a'] = true;
            
        }
        
        char ans[] = new char [st.size()];
        
        int i = st.size()-1;
        while (i >=0 )ans[i--] = st.pop();
        
        return new String (ans);
        
        
    }
}