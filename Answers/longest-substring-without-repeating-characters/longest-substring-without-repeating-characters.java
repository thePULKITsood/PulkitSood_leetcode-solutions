class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> map = new HashMap(); // current index of characte
        
        int l =0;
        int r=0;
        int max=0;
        
        while (r<s.length()){
            
            if(map.containsKey(s.charAt(r)))
                l=Math.max(l,map.get(s.charAt(r))+1);
            
            map.put(s.charAt(r),r);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}