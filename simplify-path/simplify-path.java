class Solution {
    public String simplifyPath(String path) {
        String[] comp = path.split("/");
        
        Stack <String> st = new Stack();
        
        for (String c : comp){
            if (c.equals("..")){
                if (st.size ()>0)
                    st.pop();
                
            }
            else if (c.equals(".") || c.isEmpty())
            {
                continue;
            }
            else {
                st.push(c);
            }
            
        }
        StringBuilder result = new StringBuilder ();
        for (String s : st){
            result.append("/");
            result.append(s);
            
        }
        return  result.length()> 0 ? result.toString() : "/";
        
    }
}