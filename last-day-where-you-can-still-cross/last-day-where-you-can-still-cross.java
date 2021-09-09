class Solution {
    
        
    int dir [][]= {{0,1},{0,-1},{-1,0},{1,0}};
    public int latestDayToCross(int row, int col, int[][] cells) {
        int n = cells.length;
        int left =0;
        int right =n-1;
        
        // grid = new int [row][col];
         
        int day=0;
        // bharo(left,mid,cells);
            
        while (left<=right){
            int mid =(left+right)/2;
            boolean result = bfs(row,col,mid,cells);
            
            if(result == true){
                left = mid+1;
                day=mid;
                // bharo(left,mid,cells);
            }
            
            else if (result == false){
                right = mid-1;
                // mid=(left+right)/2;
                // nikalo(mid+1,right,cells);
            }
        }
        return day;
    }
    {
//     void bharo(int left, int mid , int [][]cells){
//         for (int i=left ;i<=mid;i++){
//             int r = cells[i][0];
//             int c = cells[i][1];
//             grid[r-1][c-1]=1;
//         }
//     }
    
//     void nikalo(int mid_1, int right , int [][]cells){
//         for (int i=mid_1 ;i<=right;i++){
//             int r = cells[i][0];
//             int c = cells[i][1];
            
//             grid[r-1][c-1]=0;
//         }
//     }
    }
    
    boolean bfs(int row,int col ,int mid , int[][]cells){
        int grid[][] = new int [row][col];
        for (int i=0 ;i<mid;i++){
            grid[cells[i][0]-1][cells[i][1]-1]=1;
        }
        
        // Queue<int[]>q=new LinkedList();
        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->b[0]-a[0]);
        // boolean visited[][]=new boolean[row][col];
        
        for (int i=0;i<col;i++){
            if(grid[0][i]==0)
                q.add(new int []{0,i});
            grid[0][i]=1;
        }
        if(q.isEmpty())return false;
        
        while (!q.isEmpty()){
            // int size =q.size();
            // while(size-->0){
            
                int temp[] = q.remove();
                int myrow=temp[0];
                int mycol =temp[1];
                if(myrow==row-1)
                    return true;
                
                //else add all the unvisited neighbours
              
                
                
                for (int d[]:dir){
                    int newrow = myrow + d[0];
                    int newcol = mycol + d[1];
                    
                    if(newrow>=0 && newcol>=0 && newrow<row && newcol<col &&grid[newrow][newcol]==0)
                    {q.add(new int []{newrow,newcol});
                    grid[newrow][newcol]=1;
                    }
                    
                }
                
            // }
        }
        
        return false;
    }
}

/*

0 1 2 3 4 5 6 7 8 9 
- - - - - - 

basically after each addtiion run a bfs from all the available cells of the top and see if i can get to any bottom cell 
-> time complexity 

time complexity = for each cell -> row *cl = 2*10^4
bfs - worst case - 2*10^4
worst = 8*10^8* cols

3.
1.for each addittion  
2. running a bfs
3. running bfs on 

what if 
instead of running bfs on each addtion we run the bfs accorfding to binary search 




*/