class Solution {
    int parent[];
    int count;
    public int countComponents(int n, int[][] edges) {
         parent = new int [n];
        count =n;
        for (int i=0;i<n;i++)
            parent[i]=i;
        
        for (int e[]:edges){
            union(e[0],e[1]);
        }
        // Set<Integer> set = new HashSet();
        // for (int i:parent)
        //     set.add(i);
        // return set.size();
        return count;
            
    }
    public int findparent(int a){
        if(parent[a]==a)return a;
        return parent[a]=findparent(parent[a]);
    }
    public void union(int a , int b){
        int pa = findparent (a);
        int pb = findparent (b);
        
        if(pa!=pb){
            parent[pa]=pb;
            // parent[pb]=pb;
            count--;
        }
        // count--;
    }
}