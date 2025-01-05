class Solution {
    int n,m;
    int G[][];
    public int minimumEffortPath(int[][] heights) {
        G=heights;
        n = G.length;
        m = G[0].length;
        
        
        int left =0;
        int right = 1000000;
        int ans = right;
        
        while (left<=right){
            int mid = (left+right)/2;
            
            if(possible(mid))
            {
                ans = Math.min(ans,mid);
                right = mid-1;
            }
            else 
                left = mid+1;
            
        }
        return ans;
    }
    int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    boolean possible(int mid){
        
        Queue<int[]> q=new LinkedList();
        boolean vis [][]=new boolean[n][m];
    
        q.add(new int []{0,0});
        vis[0][0] =  true;
        
        while (!q.isEmpty()){
            
            int temp[] = q.remove();
            int x = temp[0];
            int y = temp[1];
            if(x==n-1 && y==m-1)
                return true;
            
            
            
            for (int d[] : dir){
                int nx = x+d[0];
                int ny = y+d[1];
                if(nx>=0 && ny>=0 && nx<n && ny <m && vis[nx][ny] ==false){
                    
                    if(Math.abs(G[x][y]-G[nx][ny])  <= mid){
                        
                        vis[nx][ny]=true;
                        q.add(new int []{nx,ny});
                    }
                }
            }
        }
        return false;
     }
}