class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        ArrayList<int[]> ans = new ArrayList();
        
        for (int[] i : intervals){
            
            if (ans.size ()==0 || ans.get(ans.size()-1)[1] < i[0] ) // 
                // or the end of the last one is more less than this start
                ans.add(i);
        
        
            else 
                 ans.get(ans.size()-1) [1] = Math.max(i[1] ,  ans.get(ans.size()-1)[1]);
               //update its end  ! 
            
            }
        
        return ans.toArray(new int[ans.size()][]);
        
    }
}

// tricks in the interval questions 
// 1. sort according to the starting points 
// --
    // using lambda expressions  or   comparator 
//     we will use lambda expressions 
    