class Solution {
    public int minAddToMakeValid(String s) {
//          put in stack and pop 
        // at last return the size of the stack 
        
        int left =0;
        int right = 0;
        char[] arr = s.toCharArray();
        for (char ch : arr){
            if (ch=='('){
                right ++;
            }
            if (ch==')'){
                if (right == 0)
                    left ++;
                else right --;
            }

        }
                    return left +right ;
    }
}