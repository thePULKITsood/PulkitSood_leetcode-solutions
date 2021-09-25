class Solution { ArrayList<Integer> [] g;
   
    public boolean leadsToDestination(int n, int[][] edges, int source, int dest) {
        //2 conditions 
        
        /*
        1. no cycle in a directed graph -> check using dfs 
        2. the leaf nodes must be destination only 
        
       
       now using union find 
       
        */
     g =new ArrayList[n];
        
        for (int i=0;i<n;i++)g[i]=new ArrayList();
        
        for (int e[] : edges)
            g[e[0]].add(e[1]);
        
        boolean visited []= new boolean[n];
        boolean dfsvis []= new boolean[n];
    
        if(g[dest].size()>0)return false;
        
        return dfs(visited,dfsvis,source,dest);
    }
    boolean dfs(boolean visited [],boolean dfsvis [],int src, int dest){
        
        visited[src]=true;
        dfsvis[src]=true;
        
        if(g[src].size()==0 && src!=dest)return false;
     boolean ans = true;
        for (int nbr:g[src]){
            
            if(!visited[nbr]){
                
              ans = ans && dfs(visited,dfsvis,nbr,dest);
            }
            else if (dfsvis[nbr]==true)return false;
            
        }
        
        dfsvis[src]=false;
        return ans;
    }
}