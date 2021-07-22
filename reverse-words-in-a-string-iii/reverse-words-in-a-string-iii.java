class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i< n ; i++ ){
            char ch = s.charAt(i);
            
            if(ch==' '){
                
            }
            else{
                sb=new StringBuilder();
                while (i<n && s.charAt(i) !=' ' ){
                    sb.append(s.charAt(i++));
                }
                ans.append(sb.reverse().toString());
                ans.append(' ');
                
            }
        }
        String a = ans.toString();
        return a.trim();
        
    }
}