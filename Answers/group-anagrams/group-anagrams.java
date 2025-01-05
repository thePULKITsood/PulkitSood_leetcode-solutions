class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
       Map<String,List>map = new HashMap<String, List>();
        
        for (String s : strs ){
            
            int []arr = new int [26];
            
            for (char c : s.toCharArray()){
                arr[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for(int a : arr)
            {
                sb.append(a);    
                sb.append('#');
            }
            
            String key = sb.toString();
            
            
            if(!map.containsKey(key))
            map.put(key, new ArrayList());
                
                map.get(key).add(s);
            
        }
        return new ArrayList(map.values());
        
    }
}