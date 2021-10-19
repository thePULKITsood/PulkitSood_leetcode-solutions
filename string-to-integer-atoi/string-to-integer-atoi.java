class Solution {
    public int myAtoi(String s) {
        //1. empty string 
        if (s.length( )==0) return 0;
       
//         if (str == null || str.length() == 0)
// 		return 0;
        
        
        //2. remove spaces 
        int i =0;
        while (i<s.length()&& s.charAt(i) == ' ') i++;
        
        // str = str.trim();
        
        
        int sign = 1 ;
        //3 .handle sign 
        if (i<s.length())
        {
       if(s.charAt(i) == '+' || s.charAt(i) == '-'){
        sign = s.charAt(i) == '+' ? 1 : -1;
        i ++;
   
       
       }
            
            
//     char firstChar = str.charAt(0);
// 	int sign = 1, start = 0, len = str.length();
// 	long sum = 0;
// 	if (firstChar == '+') {
// 		sign = 1;
// 		start++;
// 	} else if (firstChar == '-') {
// 		sign = -1;
// 		start++;
// 	}
            
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
        
//      for (int i = start; i < len; i++) {
// 		if (!Character.isDigit(str.charAt(i)))
// 			return (int) sum * sign;
// 		sum = sum * 10 + str.charAt(i) - '0';
// 		if (sign == 1 && sum > Integer.MAX_VALUE)
// 			return Integer.MAX_VALUE;
// 		if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
// 			return Integer.MIN_VALUE;
// 	}

// 	return (int) sum * sign; 
        
        
        else return 0;
    }
}