class Solution {
    public int minTotalDistance(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        ArrayList<Integer> rows = new ArrayList();
        ArrayList<Integer> cols = new ArrayList();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j]==1)
                rows.add(i);
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(grid[j][i]==1)
                  cols.add(i);
            }
        }
        
       int row = rows.get(rows.size() / 2);
       int col = cols.get(cols.size() / 2);
        return dis(rows,row)+dis(cols,col);
    }
    int dis(ArrayList<Integer> list, int med){
        int ans=0;
        for (int p : list)
            ans+=Math.abs(med-p);
        return ans;
    }
        
        
    
}