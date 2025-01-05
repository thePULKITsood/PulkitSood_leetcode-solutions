class Solution {
    class pair {
        
        int st ;
        int end ;
        int profit ;
        
        pair(int s , int e , int p){
            this.st =s;
            this .end = e;
            this .profit =p;
        }
    
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n  = startTime.length;
        
        int max =0;
        
        Map<Integer,Integer> map = new HashMap();
        map.put(0,0);
        
        // i need them soted acc to end time and not start time 
        // how to sort 3 arrays acc to end time 
        
        pair[] arr = new pair[n];
        
        for (int i =0;i<n;i++){
            
            
            int end = endTime[i];
            int start = startTime[i];
            int pr = profit[i];
            
            pair p = new pair (start, end ,pr );
            arr[i]=p;
        }
        
        Arrays.sort(arr,(a,b)->a.end-b.end);
        Arrays.sort(endTime);
        for (int i =0;i<n;i++){
            
            pair p = arr[i];
            
            int end = p.end;
            int start = p.st;
            int profit_now = p.profit;
            
            // the last ending should be smaller than the start 
             
            int idx = Arrays.binarySearch(endTime,start);
            
            int last_ending ;
            if(idx >= 0) last_ending = idx;
            
            else {
                // it returns - idx -1 
                // where the idx is the point of insertion and we need idx -1 -> as the lower bound 
                idx+=1;
                idx*=-1;
                
                last_ending=idx-1;
                
            }
            if( last_ending >=0 && map.containsKey(arr[last_ending].end))
            profit_now += map.get(arr[last_ending].end);
            
            max = Math.max(profit_now,max);
            map.put(end,max);
            
        }
        return max;
        
    }
}

/*

all the ending points are points of calculation 


 if i make a array of end times and i see what is the max profit at that end time 
 
 -> basically to calculate that what i need to do is take max of the sum completed at all the previous end times 
 
 and compare it with if this is the end time 
 
 just see all the arrays which end at this point and see the max profit at the biggest  end time smaller than currend time - total time 
 
 
 
*/