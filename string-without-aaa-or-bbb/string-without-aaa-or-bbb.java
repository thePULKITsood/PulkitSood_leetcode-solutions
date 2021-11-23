class Solution {
    public String strWithout3a3b(int A, int B) {
        
        StringBuilder sb = new StringBuilder();
        while (A+B >0){
            int l = sb.length();
            if(l>1 && sb.charAt(l-1)==sb.charAt(l-2)){
                //we have the same characters so we will just append the opposite character
                
                if(sb.charAt(l-1)=='a'){
                    sb.append('b');
                    B--;
                }
                else {
                    sb.append('a');
                    A--;
                }
                
            }
            else {
                if(A>B){
                    sb.append('a');
                    A--;
                }
                else {
                    sb.append('b');
                    B--;
                }
            }
        }
        return sb.toString();
        
    }
}