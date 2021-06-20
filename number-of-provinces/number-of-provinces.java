class Solution {
    public int findCircleNum(int[][] graph ) {
//          1 . make a graph
        int n = graph.length;
        int count = 0;
        boolean visited [] = new boolean [n];
        for (int i = 0 ;i< n ;i++){
            if (visited[i] == false ){
                count += dfs (i,graph,visited,n);
            }
        }
        return count ;
        
        
    }
    int dfs (int i ,int [][]graph,boolean []visited,int n ){
        visited[i] = true;
        for (int j = 0;j< n;j++){
            if (graph[i][j] == 1 && visited[j]==false ){
                dfs(j,graph,visited,n);
            }
        }
        return 1 ;
    }
}