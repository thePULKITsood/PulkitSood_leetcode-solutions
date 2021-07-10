class Solution {
    public String minRemoveToMakeValid(String s) {
        
   
        int b = 0 ; 
        StringBuilder sb = new StringBuilder ();
        
        for (char c : s.toCharArray()){
            if (c =='('){
                b++;
                sb.append(c);
            }
            else if ( c==')'){
                
                if (b!= 0){
                sb.append(c);
                b--;
                }
            }
            
            else 
            {
                sb.append(c);
                
            }
            //now we have the right ones sorted 
        }
//         now we need to do the same thing on the string builder in reverse 
        
        sb=sb.reverse();
        String newst= new String(sb);
        sb = new StringBuilder ();
        b=0;
        
        for (char c : newst.toCharArray()){
            if (c ==')'){
                b++;
                sb.append(c);
            }
            else if (c=='(') {
                if (b!= 0){
                sb.append(c);
                b--;
                }
            }
            else {
                sb.append(c);
                
            }
            //now we have the right ones sorted 
        }
        return sb.reverse().toString();
        
        
        
    }
}