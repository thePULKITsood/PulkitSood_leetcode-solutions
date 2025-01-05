class Solution {
    public int largestIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        
        int[] par = new int[rows * cols];
        for (int i = 0; i < rows * cols; i++) 
            par[i] = i;
        
        int[] size = new int[rows * cols];
        Arrays.fill(size, 1);
        // size of the max segment with the parent array 
        
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // go to each 1 and merge it with all the 4 ones which are present around it 
                    
                    int id = i * cols + j;
                    for (int k = 0; k < 4; k++) {
                        
                        int newi = i + dx[k];
                        int newj = j + dy[k];
                        int newid = newi * cols + newj;
                        
                        if (isValid(rows, cols, newi, newj) && grid[newi][newj] == 1) 
                            // if is valid and is one -> union or merge 
                            union(par, size, id, newid);
                    
                        
                    }
                }
            }
        }
        
        // now we have all the stuff required now we will go on and make all o one by one as 1 
        // then  merge them will all the 4 sides if the 4 sides have different parents 
        // then see the max size formed 
        
       int max = 0;
        
        for (int i = 0; i < size.length; i++) 
            max = Math.max(max, size[i]);
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    
                    
                     int id = i * cols + j;
                     int combinedSize = 1;
                    
                    Set<Integer> prevFather = new HashSet<>();
                    // to contain the parents of the 4 sides and not cosider onwe full island again 
                    
                    
                    for (int k = 0; k < 4; k++) {
                        
                        int newi = i + dx[k];
                        int newj = j + dy[k];
                        int newid = newi * cols + newj;
                        
                        if (isValid(rows, cols, newi, newj) && grid[newi][newj] == 1) 
                        {
                            int currFather = find(par, newid); // find the parent of this one 
                            // if parent is such that i have not considered this island 
                            
                            if(prevFather.isEmpty() || !prevFather.contains(currFather))
                            {
                              combinedSize += size[currFather];
                              prevFather.add(currFather);
                            }
                        }
                    
                        
                    }
                    max = Math.max(max, combinedSize);
                }
            }
        }
        
        
         return max == 0 ? rows * cols : max;
        
    }
    public int find(int[] par, int id) {
        if (par[id] == id) 
            return id;
        
        return par[id] = find(par, par[id]);
    }
     public void union(int[] par, int[] size, int id1, int id2) {
        int fa1 = find(par, id1);
        int fa2 = find(par, id2);
        if (fa1 != fa2) {
            par[fa1] = fa2;
            size[fa2] += size[fa1];
            // make fa2 the parent and increase its size by size [fa1];
            
        }
    }
    
    public boolean isValid(int rows, int cols, int i, int j) {
        if (i >= 0 && i < rows && j >= 0 && j < cols) {
            return true;
        }
        return false;
    }
}