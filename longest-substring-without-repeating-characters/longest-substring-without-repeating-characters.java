class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map<Character, Integer> map = new HashMap();
        
        Set<Character> set = new HashSet();
        int i = 0 ; 
        int j = 0 ;
        int n = s.length();
        int max = 0;
        
        while (j<n){
            if(! set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max,j-i);
            }
            else{
                set.remove(s.charAt(i));
                i++;
                
            }
        }
        return max;
        
    }
}