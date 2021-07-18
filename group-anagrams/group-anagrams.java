class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        if (strs.length == 0) return new ArrayList();
        
        Map<String,List>ans = new HashMap<String, List>();
        
        int [] count = new int[26];
        
        for (int i = 0 ; i< strs.length ; i++){
            
            String s = strs[i];
            Arrays.fill(count ,0);
            
            for (char ch : s.toCharArray()){
                count[ch-'a']++;
            }
            
           StringBuilder sb = new StringBuilder("");
           
            for (int j = 0; j < 26; j++) {
                
                sb.append('#');
                sb.append(count[j]);
            }
            
            String key = sb.toString();
            if (!ans.containsKey(key))
                ans.put(key,new ArrayList());
            
            ans.get(key).add(s);
            
        
        }
        return new ArrayList(ans.values());
        
    }
}