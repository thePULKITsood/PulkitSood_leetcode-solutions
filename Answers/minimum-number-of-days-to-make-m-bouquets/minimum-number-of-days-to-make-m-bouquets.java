class Solution {
    public int minDays(int[] day, int m, int k) {
        int n = day.length;
        if((long)(m*k) > n)return -1;
        
        int left=1  ;
        int right  = 1000000000 ;
        
        while (left < right ){
            int mid = (left+right)/2;
            
            int num = find (day , mid , m,k);
            if(num >= m) right =mid;
            else left =mid+1;
            
        }
        return left;
    }
    int find ( int []day , int mid , int m , int k){
        int ans =0;
        int total = 0;
        
        for (int i=0;i<day.length ; i++){
            if(day[i]<=mid)
                total ++;
            else {
                if(total >= k) ans++;
                total = 0;
                
            }
            if(total>=k)
            {
                ans++; total=0;
            }
            
        }
        return ans;
        
    }
}