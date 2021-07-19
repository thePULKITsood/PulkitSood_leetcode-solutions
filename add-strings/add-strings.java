class Solution {
    public String addStrings(String     a, String b) {
        
        
        int n = a.length() -1 ;
        int m = b.length() -1 ;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        while (n >= 0 || m >= 0)
        {
            int d1 = n >= 0 ? a.charAt(n)-'0' : 0;
            
            int d2 = m >= 0 ?  b.charAt(m)-'0': 0;
            
            int sum = d1 + d2 + carry  ;
            
            carry  = sum/10;
            sum = sum%10;
            
            
            sb.append(sum);
            
            n--;
            m--;
        }
        if(carry>0)
            sb.append(carry);
        
        return sb.reverse().toString(); 
        
        
    }
}