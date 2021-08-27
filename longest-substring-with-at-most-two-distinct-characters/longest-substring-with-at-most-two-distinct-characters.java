class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left =0;
        int right  = 0;
        int n = s.length();
        int max=0;
        HashMap<Character,Integer> map = new HashMap();
        //it will contain the char and the last index that we have of it 
        
        while (right < n){
            
            map.put(s.charAt(right),right);
              
              while (map.size()>2)
              {
                  left = Collections.min(map.values());
                  map.remove(s.charAt(left));
                  left ++;
              }
           
            right ++;
            max=Math.max(max,right-left);
             
            
        }
              
            
        return max;
        
    }
}