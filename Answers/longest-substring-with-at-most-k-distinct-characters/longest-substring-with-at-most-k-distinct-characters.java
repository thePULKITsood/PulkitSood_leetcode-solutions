class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n =s.length();
        if(n==0 || k==0)return 0;
        int left = 0;
        int right =0;
        
        Map<Character, Integer> rightmostPosition = new HashMap<>();
        //it will store the highest index that we have for one character in the hashmap
        int maxLength = 1;
        while (right<n){
            rightmostPosition.put(s.charAt(right),right);
            right++;
            
            if (rightmostPosition.size() == k + 1) {
                int low = Collections.min(rightmostPosition.values());
                rightmostPosition.remove(s.charAt(low));
                
                left=low+1;
                
            }
            
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}