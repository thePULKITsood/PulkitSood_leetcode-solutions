class Solution {
    public String frequencySort (String s) {
           StringBuilder sb = new StringBuilder();
        
        if(s==null || s.length()==0)
            return sb.toString();
        
        Map<Character,Integer> count = new HashMap();
        
        for (char ch : s.toCharArray()){
            count.put(ch, count.getOrDefault(ch,0) +1 );
        }
        
        PriorityQueue<Character> heap = new PriorityQueue((a,b)-> count.get(b) - count.get(a));
        
        for (char ch : count.keySet()){
            heap.add(ch);
        }
        
     
        
        while (heap.size()>0){
            char ch = heap.remove();
            int num = count.get(ch);
            
            while (num > 0 ){
                sb.append(ch);
                num--;
            }
        }
        
        return sb.toString();
        
    }
}