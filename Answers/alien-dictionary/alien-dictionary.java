class Solution {
    public String alienOrder(String[] words) {
        
        Map<Character,List<Character>> g = new HashMap();
        Map<Character,Integer> indegree = new HashMap();
        
        for (String word : words){
            for (char c : word.toCharArray()){
                g.put(c,new ArrayList());
                indegree.put(c,0);
            }
        }
        
        int n = words.length;
        for (int i=0;i<n-1;i++){
            
            String w1 = words[i];
            String w2 = words[i+1];
            
            if(w1.length()>w2.length() && w1.startsWith(w2))
                return "";
            
            for (int j=0;j<Math.min(w1.length(),w2.length());j++){
                char first = w1.charAt(j);
                char second = w2.charAt(j);
                
                if(first!=second){
                    g.get(first).add(second);
                    indegree.put(second,indegree.get(second)+1);
                    break;
                }
            }
            
        }
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList();
        
        for (char c : indegree.keySet()){
            if (indegree.get(c) == 0)
                q.add(c);
        }
        
        while (q.size()!=0)
        {
            char c = q.remove();
            sb.append(c);
            
            for (char next: g.get(c)){
                
                indegree.put(next,indegree.get(next)-1);
                if(indegree.get(next)==0)
                    q.add(next);
                
            }
        }
        
        if(sb.length()<indegree.size())
            return "";
        
        return sb.toString();
        
    }
}