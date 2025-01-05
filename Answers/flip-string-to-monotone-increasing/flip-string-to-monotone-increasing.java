class Solution {
    public int minFlipsMonoIncr(String s) {
        // Trim the first zeros 
        // trim the last ones 
        // then only one thing wither convert all to zero or convert all to one 
        
        StringBuilder sb = new StringBuilder();
        
        int n = s.length();
        int sum =0;
        
        for (int i=0 ;i<n;i++){
            // discard all the zeros occuring first 
            
            sum+=s.charAt(i)-'0';
            if(sum>0)
                sb.append(s.charAt(i));
            
            
        }
        // now discarding all the ones at the end 
        //if we encounter the last zero we break the loop
        
//         for (int i=sb.length()-1 ; i>=0;i--){
//             if(sb.charAt(i)=='0')
//                 break;
//             sb.deleteCharAt(i);
//         }
        
        int zero=0;
        int one =0 ;
        
        for (int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            
            if(ch=='0')zero++;
            else one++;
            if(zero >=one)
                zero=one;
        }
        return Math.min(zero,one);
        
    }
}