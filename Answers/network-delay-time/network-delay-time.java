class Solution {
    class edge{
        int to ;
        int dis ;
        edge(int to ,int dis){
            this.to=to;
            this.dis=dis;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int arr [] = new int [n+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0]=0;
        ArrayList<edge> []g = new ArrayList[n+1];
        
        for (int i=0;i<=n;i++){
            g[i]=new ArrayList();
        }
        for(int a[] :times ){
            g[a[0]].add(new edge(a[1],a[2]));
        } 
        
        PriorityQueue<edge> heap = new PriorityQueue<>((a,b)->a.dis-b.dis);
        
        heap.add(new edge(k,0));
        
        while (heap.size()>0){
            
            edge e = heap.remove();
            
            if(arr[e.to]>e.dis)
                arr[e.to]=e.dis;
            
            for (edge ed : g[e.to]){
                
                int dis = ed.dis+ e.dis;
                if(arr[ed.to] >dis )
                    heap.add(new edge(ed.to,dis));
            }
        }
        int ans =0;
        for (int i:arr)
        { ans=Math.max(ans,i);
            if(i==Integer.MAX_VALUE)return -1;
         
        }
        
        return ans;
        
        
    }
}