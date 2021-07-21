class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List<String>> map = new HashMap();
        
        for (String s : strings){
            
            if(s.length()==1)
            {
                if(!map.containsKey("one"))
                    map.put("one" ,new ArrayList() );
                
                map.get("one").add(s);
            }
                
            else{
                StringBuilder sb = new StringBuilder();
                
            for (int i= 0 ;i<s.length()-1 ; i++){
             int a  = s.charAt(i+1) - s.charAt(i) +26;
                a%=26;
                sb.append(a);
                sb.append("#");
                
            }
                String key = sb.toString();
                
                if(!map.containsKey(key))
                    map.put(key ,new ArrayList() );
                
                map.get(key).add(s);
            }
        }
        return new ArrayList(map.values());
        
    }
}