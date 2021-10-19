class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s == null || s.length() == 0) return true;
        
        int len  = s.length();
        
        for (int i =len/2 ; i>=1;i--){
            if(len%i==0){
                int m=len/i;
                
                String str= s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                
                for (int j=0;j<m;j++)
                    sb.append(str);
                
                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}