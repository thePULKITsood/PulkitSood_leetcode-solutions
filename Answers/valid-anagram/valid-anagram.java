class Solution {
    public boolean isAnagram(String s, String t) {
        int arrs[] = new int [26];
        
        for (char c : s.toCharArray()){
            arrs[c-'a']++;
        }
        int arrt[] = new int [26];
        
        for (char c : t.toCharArray()){
            arrt[c-'a']++;
        }
        
        for (int i=0;i<26;i++){
            if(arrs[i] != arrt[i])
                return false;
        }
        return true;
    }
}