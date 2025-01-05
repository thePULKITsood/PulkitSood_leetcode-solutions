class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int parent [] = new int [n];
        for (int i=0;i<n;i++)parent[i]=i;
        int ans =n;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i != j && isConnected[i][j]==1){
                    int pi = find (parent,i);
                    int pj = find (parent,j);
                    if(pi!= pj){
                        parent [pi]=pj;
                        ans--;
                    }
                }
            }
        }
        return ans;
        
    }
    public int find (int parent [] , int i){
        if(parent[i]==i)return i;
        return parent[i]=find(parent,parent[i]);
    }
}