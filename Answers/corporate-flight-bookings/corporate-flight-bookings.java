class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans []= new int [n];
        
        for (int book[] : bookings){
            ans[book[0]-1]+=book[2];
            if(book[1]<n)
            ans[book[1]]-=book[2];
        }
        
        for (int i =1;i<n;i++){
          ans[i]+=ans[i-1];  
        }
        return ans;
        
    }
}