class Solution {
     int par [];
    public boolean validTree(int n, int[][] edges) {
         if (edges.length != n - 1) return false;
       par = new int [n];
        for (int i=0;i<n;i++)par[i]=i;
        for (int e[]:edges){
            int pa = find (e[0]);
            int pb = find (e[1]);
            if(pa==pb)return false;
            par[pa]=pb;
        }
        // for (int i=1;i<n;i++)
        //     if(par[i]!=par[i-1])
        //         return false;
        return true;
    }
    int find (int a){
        if(par[a]==a)return a;
        return par[a]=find(par[a]);
    }
}