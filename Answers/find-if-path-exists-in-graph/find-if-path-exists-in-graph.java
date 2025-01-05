class Solution {
    int par[];
    public boolean validPath(int n, int[][] edges, int start, int end) {
        par = new int [n];
        for (int i=0;i<n;i++)par[i]=i;
        
        for (int []e : edges){
            int pa = find(e[0]);
            int pb = find(e[1]);
            
            if(pa!=pb)
                par[pa]=pb;
        }
            int pa = find(start);
            int pb = find(end);
            
            if(pa==pb)
                return true;
        return false;
    }
    int find(int a){
        if(par[a]==a)return a;
        return par[a]=find(par[a]);
    }
}