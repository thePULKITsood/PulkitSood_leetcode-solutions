class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips,(a,b)-> a[0]==b[0]?(b[1]-b[0] - a[1]+a[0]) :a[0]-b[0]);
        int n=clips.length;
        
            int start= clips[0][0];
        if(start!=0)return -1;
            int end =clips[0][1];
            //find the next one with right biggest and start in between start and end+1
        int maxstart =start;
        int max = end;
        int ans=1;
        
        while (end<time){
           for (int i=0;i<n;i++){
               if(clips[i][0]>=start && clips[i][0]<=end){
                   if(clips[i][1]>max){
                       max=clips[i][1];
                       maxstart=clips[i][0];
                   }
               }
           }
            if(max==end)return -1;
              start = maxstart;
               end = max;
               ans++;
               
          }
        
        return ans;
    }
}