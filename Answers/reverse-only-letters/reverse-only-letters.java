class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char [] ans = s.toCharArray();
        
        int j=n-1;
        for (char c : s.toCharArray()){
            if(Character.isLetter(c))
            {
                while (j>=0 && !Character.isLetter(ans[j])) j--;
                // if(j>=0)
                ans[j--]=c;
                
            }
        }
        return new String(ans);
        
    }
}