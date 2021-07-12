class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        
        ArrayList<int[]> ans = new ArrayList();
        
        int idx=0;
        int n = intervals.length;
        
        while (idx < n){
            
            if (intervals[idx][0]<newStart){
                ans.add(intervals[idx]);
            }  else 
                 break;
            
            idx++;
        }
        //add new interval 
        if(ans.size()==0 || newStart > ans.get(ans.size()-1)[1] )
            ans.add(newInterval);
        //no merging 
        else{
            
            int last[] = ans.get(ans.size()-1);
            last[1] = Math.max(last[1],newInterval[1]);
        }
        //now we have merged the new interval or we have added it 
        // now processing all the left intervals 
        
//         add other intefrvalss
        
        while (idx< n ){
             int last[] = ans.get(ans.size()-1);
            if(last[1]>= intervals[idx][0]){
//                 merging
                last[1] = Math.max(last[1] , intervals[idx][1]);
                
            }
            else{
                ans.add(intervals[idx]);
              
            }
            idx++;
            
            
        }
          return ans.toArray(new int [ans.size()][2]);
        
    }
}