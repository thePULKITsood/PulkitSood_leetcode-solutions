class Solution {
      int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
    public int[][] findFarmland(int[][] land) {
      
        List<int[]> list = new ArrayList();
        int ans[] ;
        
        int n = land.length;
        int m = land[0].length;
        
        for (int i=0;i<n ; i++){
            for(int j=0;j<m;j++){
                
                ans= new int []{i,j,i,j};
                if(land[i][j]!=0){
                    
                dfs(i,j,land,ans);
                list.add(ans);
                    
                }
            }
        }
        
        int i=0;
        int res[][]=new int [list.size()][4];
        
        for(int point[]:list){
            
            res[i]=point;
            i++;
        }
        
        return res;
        
    }
    
    void dfs(int i , int j , int [][]land,int ans[]){
        
        if(i<0 || j<0 || i>= land.length || j>=land[0].length || land[i][j] == 0) 
            return;
        
        land[i][j]=0;
        
        //ans -> small i small j   big i big j
        
        // change the answer
        if(i<=ans[0] && j<=ans[1]){ // firstly the row should be smaller if yes the row is smaller then the column must also be smaller 
            
            ans[0]=i;
            ans[1]=j;
        }
        
        if(i>=ans[2] && j>=ans[3]){ // the row must be bigger and the column must be bigger 
            ans[2]=i;
            ans[3]=j;
        }
        
        
        for (int d[]:dir){
            int newi = i+d[0];
            int newj = j+d[1];
            
            dfs(newi,newj,land,ans);
        }
    }
}