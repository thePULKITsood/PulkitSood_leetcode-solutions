class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        ArrayList <Integer> []g = new ArrayList[n+1];
        
        for (int i=0;i<=n;i++)g[i]=new ArrayList();
        
        //store what courses i can do after it 
        int indegree[] = new int [n+1];
        
        for (int rel []:relations){
            int prev = rel[0];
            int next =rel[1];
            
            g[prev].add(next);
            indegree[next]++;
        }
        
        Queue<Integer> q = new LinkedList();
        
        for (int i=1;i<=n;i++)
            if(indegree[i]==0)
                q.add(i);
        
        int sem =0;
        int total =0;
        
        while (q.size()!=0){
            int size = q.size();
            while (size-->0){
            
                int temp = q.remove();
                total++;
                
                for (int i : g[temp]){
                    indegree[i]--;
                    if(indegree[i]==0)q.add(i);
                }
            }
            sem++;
        }
        if(total==n)return sem;
        else return -1;
                
        
    }
}