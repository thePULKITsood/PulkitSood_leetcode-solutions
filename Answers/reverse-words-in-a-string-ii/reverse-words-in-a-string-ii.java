class Solution {
    public void reverseWords(char[] s) {
        int n = s.length;
        for (int i = 0;i<n;i++ ){
            int start = i;
            int end =i;
            while(end<n && s[end]!=' ')
                end++;
            i=end;
            end--;
            reverse (s,start,end);
            
        }
        reverse (s,0,n-1);
        
        
    }
    void reverse (char[] s , int start , int end){
        while(start<end){
            char temp= s[start];
            s[start]=s[end];
            s[end]=temp;
            
            start++;
            end--;
        }
    }
}