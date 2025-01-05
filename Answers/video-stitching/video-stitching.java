class Solution {
    public int videoStitching(int[][] clips, int time) {
        // sort on the basis of starting index 
        //if the index is bigger then sort on the basis of which one is larger
        // vese it dosnt matter as we will be comparing each one for the position any way 1 
        
        // Arrays.sort(clips,(a,b)-> a[0]==b[0]?(b[1]-b[0] - a[1]+a[0]) :a[0]-b[0]);
       
        
        Arrays.sort(clips,(a,b)->{
            if(a[0]==b[0])
            {
                int lb=b[1]-b[0];
                int la = a[1]-a[0];
                
                return lb-la;
                //matlab jiski length baddi wo aae 
            }
            else return  a[0]-b[0];
        });
       
        int n=clips.length;
        
            int start= clips[0][0];
        
        if(start!=0)return -1;
        
        int end =clips[0][1];
        
        // find the  next one with the start between start and end and choose the one who has its end the biggest 
        int maxstart =start;
        int max = end;
        int ans=1;
        
        while (end<time){
            
           for (int i=0;i<n;i++){
               
               //if start is within bounds 
               if(clips[i][0]>=start && clips[i][0]<=end){
               
                   // then select the end which is farthest 
                   if(clips[i][1]>max){
                       max=clips[i][1];
                       maxstart=clips[i][0];
                   }
               }
           }
            
            
            if(max==end)return -1; // means no one was selected ! 
            
              start = maxstart; // start = the start of the clip that we selected ! 
               end = max;
               ans++; // ans ++ as we selected one 
               
          }
        
        return ans;
    }
}