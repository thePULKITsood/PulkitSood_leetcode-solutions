class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = 1001;
        int par[] = new int [n];
        for (int i=0;i<n;i++)
            par[i]=i;
        
        for (int e[]:edges){
            int pa = find (par,e[0]);
            int pb=find(par,e[1]);
            if(pa==pb)
                return e;
            else {
                par[pa]=pb;
            }
        }
        return edges[edges.length-1];
        
    }
    public int find (int []par ,int u){
        if(par[u]==u)return u;
       return par[u]=find(par,par[u]);
    }
}