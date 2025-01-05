class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;

       int left = 0;  // string 
        int right = 0; // target 
        
        while (left < s.length() && right <t.length() ){
            if (s.charAt(left) == t.charAt(right)){
                left++;
                
            }
            right ++;
        }
        return left == s.length();
        
        
    }
}