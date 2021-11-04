class Solution {
    int memo[][][];
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        
        memo=new int [n][n][27];
        char zero = 'z'+1;
       return  func (0,n-1,zero,s);
        
    }
    
   int  func (int i , int j , char prev , String s  ){
        
       if(i>=j)return 0;
       
        if(memo[i][j][prev-'a']!=0)
            return memo[i][j][prev-'a'];
       
  
        
        if(s.charAt(i)==prev) return memo[i][j][prev-'a']= func(i+1,j,prev,s);
        if(s.charAt(j)==prev) return memo[i][j][prev-'a']= func(i,j-1,prev,s);
        
        
        if(s.charAt(i)==s.charAt(j))
            return  memo[i][j][s.charAt(i)-'a']= func(i+1,j-1,s.charAt(i),s)+2;
        
        return  memo[i][j][prev-'a'] = Math.max(func(i+1,j,prev,s),func(i,j-1,prev,s));
        
    }
}