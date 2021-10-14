class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
      
        //base case
        if (n < 2) {
            ArrayList<Integer> centroids = new ArrayList<>();
            for (int i = 0; i < n; i++)
                centroids.add(i);
            return centroids;
        }
        
        //build graph
        ArrayList<Integer> []g = new ArrayList[n];
        int[] degree = new int[n];
        
        for (int i=0;i<n;i++)
            g[i]=new ArrayList();
        
        for (int [] edge : edges){
            
            int i = edge[0];
            int j = edge[1];
            
            g[i].add(j);
            g[j].add(i);
            
            degree[i]++;
            degree[j]++;
        }
        
        //initialize the first layer of leaves
     
    List<Integer> leaves = new ArrayList<>();
        for (int i=0;i<n;i++){
            if(degree[i]==1){
                leaves.add(i);
            }
       }
        
        // as we know there can be at max two centroids thats why 
        
        
        /*
        basically wee whos leave
        then go to its one and only neightbours and delete itself from their arraylist
        
        then if their lists size is one means they are also leaf 
        so add them to new leaf
        
        at the end we will be having only the centroids !
        
        */
        while (n>2){
            n-=leaves.size();
            //to make new leaves
            List<Integer> newleaves = new ArrayList<>();
            
            for (int i:leaves){
              for (int j:g[i]){
                  // degree[i]--;
                  degree[j]--;
                  if(degree[j]==1)
                      newleaves.add(j);
              }
            }
            leaves=newleaves;
        }
        return leaves;
    }
        
}