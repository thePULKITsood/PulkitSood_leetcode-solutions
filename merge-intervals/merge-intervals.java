class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> ans = new ArrayList();
        
        for (int[] i : intervals){
            
            if (ans.size ()==0){
                ans.add(i);
            }
            
            else {
                int previ[] = ans.get(ans.size()-1);
                
                 if (i[0] <= previ[1])
                previ [1] = Math.max(i[1] , previ[1]);
               
                else 
                    ans.add(i);
                
            }
            }
        
        return ans.toArray(new int[ans.size()][]);
        
    }
}

// tricks in the interval questions 
// 1. sort according to the starting points 
// --
    // using lambda expressions  or   comparator 
//     we will use lambda expressions 
    