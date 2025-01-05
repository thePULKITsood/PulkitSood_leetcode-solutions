class Solution {
    public int minTaps(int n, int[] ranges) {
       
        int min=0;
        int max=0;
        int open =0;
        
        while (max<n){
            
            // in the first scan we will see which ranges 
            // starting point is in between our min and max and how much further can it go 
            
            // to find that 
            int  newmax = max;
            int newmin = min;
            for (int i=0;i<ranges.length;i++){
            
                int rangelow = Math.max(0, i-ranges[i]); // starting point 
                int rangehigh = Math.min(n,i+ranges[i]);
                
                // now if this is in between our min and max then we can consider it 
                
                if(rangelow>=min && rangelow<=max){
            
                    if(rangehigh>newmax) {
                        newmax=rangehigh;
                        newmin = rangelow;
                    }
                  // as we are taking the max so we will update it 
                }
                
            }
            //after the ending of the loop we will update our max as newMax and our min as 
            //as teh one we have selected as our new include 
            
              if(newmax==max)return -1; // meaning our newmax was not updated at all 
               min = newmin;
               max = newmax;
                open++;
        }
        
        return open;
        
    }
}