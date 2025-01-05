class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color [] = new int [n];
        Arrays.fill(color,-1);
        
        for (int i=0;i<n;i++){
            if(color[i]==-1){
                color[i]=0;
                if(bfs(graph,color,i))
                    return false;
            }
        }
        return true;
        
    }
    boolean bfs (int [][]graph, int color[] , int i){
        // now color all my un colored ones and it they are colored they must be the correct color
        
        int childcolor =1;
        
        Queue<Integer>q=new LinkedList();
        q.add(i);
        
        while (!q.isEmpty()){
            int size = q.size();
            while (size-- >0){
                int rem = q.remove();
                
                for (int n : graph[rem]){
                    if(color[n]== -1 ){
                        color[n]= childcolor;
                        q.add(n);
                    }
                    
                    else if (color[n]== color[rem])
                        return true;
                    
                }
            }
            
            childcolor = (childcolor+1)%2;
        }
        return false;
    }
}

/*

1. if it has a odd length cycle it is not a bipertite graph and if 
it does not have a odd length cycle then it is not a bipertite graph

*/