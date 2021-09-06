class Solution {
    public int[][] findFarmland(int[][] land) {
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        List<int[]> list = new ArrayList();
        int ans[] ;
        int n = land.length;
        int m = land[0].length;
        for (int i=0;i<n ; i++){
            for(int j=0;j<m;j++){
                ans= new int []{i,j,i,j};
                if(land[i][j]!=0){
                dfs(i,j,dir,land,ans);
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
    
    void dfs(int i , int j , int [][]dir,int [][]land,int ans[]){
        
        if(i<0 || j<0 || i>= land.length || j>=land[0].length || land[i][j] == 0) 
            return;
        
        land[i][j]=0;
        
        //ans -> small i small j   big i big j
        // change the answer
        if(i<=ans[0] && j<=ans[1]){
            ans[0]=i;
            ans[1]=j;
        }
        
        if(i>=ans[2] && j>=ans[3]){
            ans[2]=i;
            ans[3]=j;
        }
        
        
        for (int d[]:dir){
            int newi = i+d[0];
            int newj = j+d[1];
            
            dfs(newi,newj,dir,land,ans);
        }
    }
}
/*

if i go row by row then i will find the first coordinate but the problem is with the last one 

two cases can be there 
i can run a bfs and the last one will be the answer 

as it will have max distance and we are having rectangular farmlands 

or what i can do is first go all left and then go all down 


*/