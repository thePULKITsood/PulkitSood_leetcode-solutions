class Solution {
    public int myAtoi(String s) {
        //1. empty string 
        if (s.length( )==0) return 0;
       
        //2. remove spaces 
        int i =0;
        while (i<s.length()&& s.charAt(i) == ' ') i++;
        
        int sign = 1 ;
        //3 .handle sign 
        if (i<s.length()){
       if(s.charAt(i) == '+' || s.charAt(i) == '-'){
        sign = s.charAt(i) == '+' ? 1 : -1;
        i ++;
    }
        long sum =0;
        //4 convert number 
        while (i<s.length()){
            
            int digit = s.charAt(i)-'0';
            if (digit<0  || digit > 9) break;
            
            sum =sum*10 + digit;
            
            if (sum>Integer.MAX_VALUE && sign==1) return Integer.MAX_VALUE;
            if (sign * sum <Integer.MIN_VALUE && sign==-1) return Integer.MIN_VALUE;
            i++;
            
        }
      
        return(int) (sum *sign );
    
    }
        else return 0;
    }
}