class Solution {
    HashMap<String,PriorityQueue<String>> graph;
    LinkedList<String>ans;
    public List<String> findItinerary(List<List<String>> tickets) {
    
        graph = new HashMap();
        ans = new LinkedList();
       
        for(List<String>ticket:tickets){
            
            String origin = ticket.get(0);
            String dest = ticket.get(1);
            
            PriorityQueue<String> temp = graph.getOrDefault(origin,new PriorityQueue());
            
            temp.add(dest);
            graph.put(origin,temp);
        }
        
        dfs("JFK");
        return ans;
    }
    public void dfs(String src){
        
      PriorityQueue<String> nbrs = graph.get(src);
        
        while (nbrs!=null && nbrs.size()>0){
            
            String nbr = nbrs.remove();
            dfs(nbr);
        }
        
        ans.addFirst(src);
    }
}