class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)-> Integer.compare(a[0] , b[0]));
        
        int arr[] = points[0];
        int n =points.length;
        
        int count = 1;
        for (int i = 1 ; i< n ; i++)
        
        {
          if (points[i][0]<= arr[1])
          {
              arr[1]=Math.min(arr[1],points[i][1]);
              
          }
            else {
                count++;
                arr = points[i];
            }
        }
        return count ;
    }
}
// i need to join baloons 
