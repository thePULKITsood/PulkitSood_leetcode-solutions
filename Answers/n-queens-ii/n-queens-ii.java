class Solution {  
    int res = 0;
    
    public int totalNQueens(int n) 
    {
      // //int[] horizonal = new int[n];
      // boolean[] vertical = new boolean[n];
      // boolean[] leftfall = new boolean[2 * n - 1];
      // boolean[] rightfall = new boolean[2 * n - 1];
      // // helper(n, vertical, leftfall, rightfall, 0);
         helper( n,   new HashSet<Integer>(),   new HashSet<Integer>(),   new HashSet<Integer>(), 0 );
      return res;
    }
    
//     void helper(int n, boolean[] v, boolean[] l, boolean[] r, int row){
      
    void helper(int n,    HashSet<Integer>cols,    HashSet<Integer>diag,    HashSet<Integer>anti, int row){
      
        
      if(row == n){
        res++;
        return;
      }
      
      for(int col = 0; col < n; col++){
          int d=row+col;
          int a = row-col;
          
         if(cols.contains(col)||diag.contains(d)||anti.contains(a) )
             continue;
         {
             cols.add(col);
             diag.add(d);
             anti.add(a);
//          v[col] = true;
//          l[row - col + n - 1] = true;
//          r[row + col] = true;
         
         helper(n, cols, diag, anti, row + 1);
         
//          v[col] = false;
//          l[row - col + n - 1] = false;
//          r[row + col] = false;
              cols.remove(col);
             diag.remove(d);
             anti.remove(a);
         }
      }    
    }

}