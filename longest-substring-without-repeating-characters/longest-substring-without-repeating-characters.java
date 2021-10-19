class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        int left =0;
        int right =0;
        int len = s.length();
        
        int ans =0;
        
        while (right<len){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            
               
            }
             map.put(s.charAt(right),right);
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
        
    }
}