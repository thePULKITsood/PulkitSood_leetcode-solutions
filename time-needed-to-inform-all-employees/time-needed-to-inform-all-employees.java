class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<Integer>[] graph = new List[n];
        
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        
        for (int i = 0; i < n; i++) 
            if (manager[i] != -1) 
                graph[manager[i]].add(i);
        
        Queue<int[]> q = new LinkedList();
        q.add(new int []{headID,0 });
        int ans =0;
        
        while (!q.isEmpty()){
              int[]top = q.remove();
                
                int u=top[0];
                int t=top[1];
                
               ans = Math.max(ans,t);
                
                for (int i: graph[u])
                    q.add(new int []{i,informTime[u] + t});
                
            }
            
            
            
        
        return ans;
        
    }
}