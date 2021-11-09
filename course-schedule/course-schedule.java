class Solution {
    public boolean canFinish(int n, int[][] pre) {
        ArrayList<Integer>[]  graph = new ArrayList [n];
        
        for (int i = 0 ; i< n ; i++ )
        {
            graph[i] = new ArrayList<Integer>();
        }
        
        int []indegree = new int [n];
        
        for (int [] a : pre)
        {
            indegree[a[0]] ++ ; 
        
            graph[a[1]] .add(a[0]);
        
        }
        
        LinkedList <Integer> q = new LinkedList ();
        
        for (int i = 0 ; i< n ;i++)if (indegree[i]==0)q.addLast(i);
        
        int count = 0 ;
        
        while (q.size()!=0)
        {
            int rem = q.removeFirst();
            count++;
        
            for (int e :graph[rem])
            {
                indegree[e]--;
                if (indegree[e] == 0)q.addLast(e);
            }
        }
        return count ==n;
    }

}