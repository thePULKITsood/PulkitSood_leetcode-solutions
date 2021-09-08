class Solution {
    public String replaceDigits(String s) {
        int n =s.length();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                int c =s.charAt(i-1);
                char ch =(char)(c + s.charAt(i)-'0');
                sb.append(ch);
                
            }
               else  sb.append(s.charAt(i));
        }
        return sb.toString();
        
    }
}