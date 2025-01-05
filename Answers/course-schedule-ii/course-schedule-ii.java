class Solution {
    public int[] findOrder(int n, int[][] pre) {
        ArrayList<Integer> [] g = new ArrayList[n];
        //store the diagronal and the courses i can do after this one 
        for (int i=0;i<n;i++)
            g[i]=new ArrayList();
        
        int indegree []=new int [n];
        
        for (int [] arr :pre){
            int do1st = arr[1];
            int do2nd = arr[0];
        
            g[do1st].add(do2nd);
            
            indegree[do2nd]++;
        }
        Queue<Integer> q = new LinkedList();
        
        for (int i=0;i<n;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        
        
        int ans[] = new int [n];
        int idx =0;
        while (q.size()!=0){
            int temp = q.remove();
            ans[idx++]=temp;
            
            for (int i:g[temp]){
                indegree[i]--;
                if(indegree[i]==0)
                    q.add(i);
            }
        }
        if(idx ==n)
        return ans;
                    
        return new int[0];
        
    }
}