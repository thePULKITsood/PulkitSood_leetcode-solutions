class Solution {
    int []mapping = new int [26];
        
    public boolean isAlienSorted(String[] words, String order) {
        for (int i =0;i<26 ; i++){
            mapping[order.charAt(i)-'a']=i;
        }
        
        for (int i = 1 ; i <words.length ; i++){
            if (bigger(words[i-1] , words[i]))
                return false;
        }
        return true;
            
        
        
    }
    boolean bigger (String a, String b){
        int n=a.length(); int m=b.length();
        int i =0;
        while (i<n && i<m)
        {
//             if equal continue 
//             if not equal then a should be big it big return true if not return false
            
            if ( a.charAt(i) != b.charAt(i)){
            int idxa=mapping[a.charAt(i)-'a'];
                
            int idxb=mapping[b.charAt(i)-'a'];
                
                return idxa>idxb;
                
            }
            
            i++;
            
        }
        return n>m;
    }
}