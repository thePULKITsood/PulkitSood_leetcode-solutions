class Solution {
    public String decodeString(String s) {
          Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
     
         String res = "";
        int idx = 0;
        while (idx < s.length()) {
            
            if (Character.isDigit(s.charAt(idx))) {
                
                int count = 0;
                
                while (Character.isDigit(s.charAt(idx)))
                {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            
            else if (s.charAt(idx) == '[') {
                
                resStack.push(res);
                res = "";
                idx++;
            }
            
             else if (s.charAt(idx) == ']') 
             {
                StringBuilder temp = new StringBuilder (resStack.pop());
                 
                int repeatTimes = countStack.pop();
                 
                for (int i = 0; i < repeatTimes; i++)
                {
                    temp.append(res);
                }
                 
                res = temp.toString();
                idx++;
            }
              
            else {
                res += s.charAt(idx++);
            }

    }
        return res;
    }
    
}

// But the trick here is that there can be nested encoded strings like k[string k[string]]. For example, string s =3[a2[c]]. In such cases, we must decode the innermost string and continue in an outward direction until the entire string is decoded.

// The pattern begins with a number k, followed by opening braces [, followed by string. Post that, there could be one of the following cases :

// There is another nested pattern k[string k[string]]
// There is a closing bracket k[string]
// Since we have to start decoding the innermost pattern first, continue iterating over the string s, pushing each character to the stack until it is not a closing bracket ]. Once we encounter the closing bracket ], we must start decoding the pattern.