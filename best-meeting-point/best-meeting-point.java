class Solution {
    public int minTotalDistance(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        
        
        // he implementation is direct. First we collect both the row and column coordinates, sort them and select their middle elements. Then we calculate the total distance as the sum of two independent 1D problems
        
        ArrayList<Integer> rows = new ArrayList();
        ArrayList<Integer> cols = new ArrayList();
        
        // we are doing seperately as we need the coordinates in sorted order to find the  median 
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j]==1){
                rows.add(i);
                // cols.add(j);
                }
            }
        }
        // for (int row = 0; row < grid.length; row++) {
        // for (int col = 0; col < grid[0].length; col++) {
        //     if (grid[row][col] == 1) {
        //         rows.add(row);
        //         cols.add(col);
        //     }
        // }
        // }
        
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