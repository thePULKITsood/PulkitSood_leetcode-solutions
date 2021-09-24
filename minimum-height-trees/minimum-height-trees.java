class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edge) {
        List<Integer> ans =new ArrayList<Integer>();
        ans.add(0);
        if(n==1)return ans;
        
        ArrayList<Integer> []g = new ArrayList[n];
        
        for (int i=0;i<n;i++)
            g[i]=new ArrayList();
        
        for (int [] e : edge){
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        
     
    List<Integer> leaves = new ArrayList<>();
        for (int i=0;i<n;i++){
            if(g[i].size()==1)
                //means only one connection 
                // that means it is a leaf
                leaves.add(i);
            
                
        }
        while (n>2){
            n-=leaves.size();
            List<Integer> newleaves = new ArrayList<>();
            
            for (int i:leaves){
                int neigh = g[i].get(0);
                
                for (int j=0;j<g[neigh].size();j++){
                    if(g[neigh].get(j)==i){
                        g[neigh].remove(j);
                        break;
                    }
                }
                
                if(g[neigh].size()==1)
                    newleaves.add(neigh);
            }
            leaves=newleaves;
        }
        return leaves;
    }
        
}