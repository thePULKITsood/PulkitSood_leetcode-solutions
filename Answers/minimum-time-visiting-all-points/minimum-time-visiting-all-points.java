class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        
        for (int i = 0; i < points.length-1; i++) {
            int x = points[i][0];
            int y = points[i][1];
            
            int a = points[i+1][0];
            int b = points[i+1][1];
            
            time += Math.max(Math.abs(a - x), Math.abs(b - y));
        }
        
        return time;
    }
}
//     public int minTimeToVisitAllPoints(int[][] points) {
        
//         int ans = 0;
//         int n = points.length;
//         for (int i=0;i<n-1;i++){
//             ans+= func(point[i],points[i+1]);
//         }
//         return ans;
       
        
//     }
//     int func(int[] p1,int []p2){
//         int ans =0;    // /
//         // moving on the / diagonal 
        
        
        
        
        
//         // moving on the   \ 
//         //   diagonal       \  
        
        
        
//         return ans;
//     }
//     // move diagonally then in a straight line 
    
// }
/*
1. how ot move diagonally 

1. moving from point 1 to point 2 

1 1 

3 4 


if(x2>x1 && y2>y1) // move diagonally 
x1++
y1++

11 -> 22 -> 33
//now this will give false

if(y2>y1)
y1++

33 -> 34


*/