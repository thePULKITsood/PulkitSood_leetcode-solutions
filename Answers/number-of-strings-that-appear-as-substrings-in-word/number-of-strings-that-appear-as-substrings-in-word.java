class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans=0;
        for (String s : patterns){
            ans+= exists(s,word);
        }
        return ans;
        
    }
    int exists(String s , String word){
        int n=s.length();
        int m=word.length();
        if(n>m)return 0;
        
        for (int i=0;i<m-n+1;i++){
            if(s.equals(word.substring(i,i+n)))
                return 1;
        }
        return 0;
    }
}