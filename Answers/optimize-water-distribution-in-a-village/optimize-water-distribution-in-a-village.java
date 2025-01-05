class Solution {
    int par [];
  class Edge {
        int from ;
        int to ;
        int dis;
        Edge(int from , int to , int dis){
            this.from=from;
            this.to=to;
            this.dis=dis;
        }
    }
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        //0 is the well 
        par = new int [n+1];
        for (int i=0;i<n+1;i++)par[i]=i;
       
        PriorityQueue<Edge> heap = new PriorityQueue<>((a,b)-> a.dis-b.dis);
        
        for (int i=0;i<n;i++){
            Edge e = new Edge(0,i+1,wells[i]);
            heap.add(e);
        }
        for (int [] e : pipes){
            Edge ed = new Edge(e[0],e[1],e[2]);
            heap.add(ed);
        }
        
        
        int edges=0;
        int ans=0;
        
        while (edges < n){
            
            Edge e= heap.remove();
            int pa=find(e.from);
            int pb=find(e.to);
            
            if(pa!=pb){
                par[pa]=pb;
                edges++;
                ans+=e.dis;
            }
        }
        return ans;
    
    }
    int find (int u){
        if(par[u]==u)return u;
        return par[u]=find(par[u]);
        
    }
}