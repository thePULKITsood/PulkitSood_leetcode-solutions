class Solution {
    public int minTaps(int n, int[] ranges) {
        int range [][]= new int [n+1][2];
        for (int i=0;i<=n;i++){
            int l =Math.max(0, i-ranges[i]);
            int r = i+ranges[i];
            
            range[i][0]=l;
            range[i][1]=r;
        }
        // Arrays.sort(range,(a,b)->a[0]-b[0]);
          Arrays.sort(range,(a,b)-> a[0]==b[0]?(b[1]-b[0] - a[1]+a[0]) :a[0]-b[0]);
        
        int start =range[0][0];
        int end = range[0][1];
        
        int max=end;
        int maxstart=start;
        
        if(start>0)return -1;
        int ans=1;
        
        while (end<n){
            for (int i=0;i<=n;i++){
                if(range[i][0]>=start && range[i][0]<=end){
                    if (range[i][1] > max){
                        maxstart=range[i][0];
                        max = range[i][1];
                    }
                }
            }
            if(max==end)return -1;
            end=max;
            start=maxstart;
            // if(maxstart==0)ans--;
            ans++;
            
            
        }
        return ans;
        
        
    }
}