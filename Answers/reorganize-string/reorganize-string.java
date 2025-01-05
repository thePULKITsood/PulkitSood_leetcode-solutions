class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
         PriorityQueue<Character> heap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        
        heap.addAll(map.keySet());
        StringBuilder ans =new StringBuilder();
        
        while (heap.size()>1){
            char first = heap.remove();
            char second = heap.remove();
            
            ans.append(first);
            ans.append(second);
            map.put(first,map.get(first)-1);
            
            map.put(second,map.get(second)-1);
            if(map.get(first)>0)
                heap.add(first);
             if(map.get(second)>0)
                heap.add(second);
            
                
        }
        if(!heap.isEmpty()){
            char last = heap.remove();
            if(map.get(last)>1)
                return "";
        
        ans.append((last));
        }
        return ans.toString();
    }
}