class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> ans = new ArrayList();
        
        dfs(0,n-1,graph,ans,new ArrayList<Integer>(),new boolean[n]);
        return ans;
        
    }
    void dfs(int start, int end , int[][]graph,List<List<Integer>>ans,ArrayList<Integer> mini,boolean[]visited){
       
        
        mini.add(start);
        visited[start]=true;
        
        if(start==end){
            ans.add(new ArrayList<>(mini));
            // mini.remove(mini.size()-1);
            // return;
        }
        for (int i:graph[start]){
            if(visited[i]==false)
            dfs(i,end,graph,ans,mini,visited);
        }
        visited[start]=false;
        mini.remove(mini.size()-1);
    }
}