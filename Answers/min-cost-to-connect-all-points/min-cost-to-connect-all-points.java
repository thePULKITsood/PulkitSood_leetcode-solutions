class Solution {
    class edge {
        int from ;
        int to ;
        int dis;
        edge(int from , int to , int dis){
            this.from=from;
            this.to=to;
            this.dis=dis;
        }
    }
    
    /*
    
    
    1. basically 2 parts -
    1. sabto chote walle lagane hai edges  -> priority Queue with distance
    2. cycle form hon nahi dena -> parent array and just  simple union 
    
    
    
    */
    int par [];
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
         par= new int [n];
        for (int i=0;i<n;i++)par[i]=i;
        
        PriorityQueue<edge> heap = new PriorityQueue<>((a,b)-> a.dis-b.dis);
        
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
             
                    int x = points[i][0]-points[j][0] ;
                    int y = points[i][1]-points[j][1] ;
                    int dis = Math.abs(x)+Math.abs(y);
                    
                    heap.add(new edge(i,j,dis));
            }
        }
        int edges=0;
        int ans=0;
        while (edges < n-1){
             edge e= heap.remove();
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