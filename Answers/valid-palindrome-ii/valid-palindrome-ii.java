class Solution {
    public boolean validPalindrome(String s) {
//         1. write code for palindrome and when i find achar which is not present i will skip one character
//         that skip will be based on the next character 
//         if i dont skip any return false 
//           if i skip once and i have found return true 
//         if i skip more than once return false 
        
        int i = 0 ; 
        int j = s.length()-1;
        
        while (i<j)
        {
            if(s.charAt(i)!=s.charAt(j)){
                return func(s,i+1,j)|| func(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
        
    }
    boolean func(String s , int i , int j ){
        while (i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            i++;
            j--;
        }
        return true;
    }
}