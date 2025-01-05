class Solution {
    int par[];
    public int minimumCost(int n, int[][] edges) {
        
        if(edges.length < n-1) return -1;
        par= new int [n+1];
        for (int i=0;i<n+1;i++)par[i]=i;
        
        PriorityQueue<int []> heap = new PriorityQueue<>((a,b)-> a[2]-b[2]);
        
        for (int e[] :edges)
            heap.add(e);
        
        int ans =0;
        int edge=0;
        while (edge<n-1){
            int []e= heap.remove();
            int pa=find(e[0]);
            int pb=find(e[1]);
            
            if(pa!=pb){
                par[pa]=pb;
                edge++;
                ans+=e[2];
            }
        }
        return ans;
    }
    int find (int u){
        if(par[u]==u)return u;
        return par[u]=find(par[u]);
    }
}