class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> ans = new ArrayList();
        
        int [] newi = intervals[0];
        ans.add(newi);
        
        for (int [] i : intervals){
        if (i[0]<=newi[1])
            newi[1] = Math.max(newi[1],i[1]);
            
            else{
                newi = i;
                ans.add(newi);
            }
            
        }
        
        return ans.toArray(new int [ans.size()][]);
    }
}
//sort then the linear operation

// nlogn + n