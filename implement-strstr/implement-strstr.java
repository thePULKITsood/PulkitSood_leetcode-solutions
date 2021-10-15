class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)return 0;
        int n = needle.length();
        int m = haystack.length();
        
        for (int i=0;i<m - n  + 1  ;i++)
        {
            if(haystack.substring(i,i+n).equals(needle))
                return i;
        }
        return -1;
        
    }
}