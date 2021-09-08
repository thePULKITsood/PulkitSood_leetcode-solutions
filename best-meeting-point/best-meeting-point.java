class Solution {
    public int minTotalDistance(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        ArrayList<int[]> ones = new ArrayList();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(grid[i][j]==1)
                    ones.add(new int[]{i,j});
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int dis =0;
                for (int one[] : ones){
                    int a=Math.abs(i-one[0])+Math.abs(j-one[1]);
                    dis+=a;
                }
                min=Math.min(dis,min);
                
            }
        }
        return min;
        
        
    }
}