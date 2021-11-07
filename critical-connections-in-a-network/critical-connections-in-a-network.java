class Solution {
    Integer rank[];
    Map<Integer,List<Integer>> graph ;
    Map<Pair<Integer,Integer>,Boolean> edges;
    
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        
        rank = new Integer [n];
        graph = new HashMap<Integer, List<Integer>>();
        edges = new HashMap<Pair<Integer,Integer>,Boolean>();
        
        // make a graph 
        makeGraph(n,connections);
       
        //  run a dfs 
        
        dfs(0,0);
    
        List<List<Integer>> result = new ArrayList();
        for (Pair<Integer,Integer> e :edges.keySet()){
            int key = e.getKey();
            int val = e.getValue();
            
            ArrayList<Integer> mini =new ArrayList();
           
            mini.add(key);
            mini.add(val);
            
            result.add(mini);
        }
        return result;
    
    
    
    
    
    
    }
    int  dfs(int node , int discRank){
        
        //already visited return the rank
        if(rank[node]!=null)return rank[node];
        
        
        
        //this function will return the minimum node from its neighbours or itself so that we can remove the edges from the minimum till this node 
        
        rank[node ]=discRank;
        int minRank = discRank+1;
        
        for (int nbr : graph.get(node)){
            //skip the parent 
            if(rank[nbr]!=null && rank[nbr]==discRank-1)
                continue;
            
            int rankReturned = dfs(nbr,discRank+1);
            
            //if we have got a lower rank t
            if(rankReturned<=discRank){
            int sortedu = Math.min(node,nbr);
            int sortedv = Math.max(node,nbr);
            
            //as the rank returned by neighour was smaller than mine so i must remove this edge 
                edges.remove(new Pair<Integer,Integer>(sortedu,sortedv));
            
            }
            
            
            minRank = Math.min(minRank,rankReturned);
        }
        return minRank;
        
    }
    
    
    void makeGraph (int n, List<List<Integer>> connections){
        for (int i=0;i<n;i++){
            
            //default rank for unvisited node == null
            
            rank[i]=null;
            graph.put(i,new ArrayList<Integer>());
        }
        for (List<Integer> e:connections){
            int u=e.get(0);
            int v = e.get(1);
            
            graph.get(u).add(v);
            graph.get(v).add(u);
            
            // to have consistent stuff in the  edges map 
            
            int sortedu = Math.min(u,v);
            int sortedv = Math.max(u,v);
            
            edges.put(new Pair<Integer,Integer> (sortedu,sortedv),true);
        }
        
    }
}