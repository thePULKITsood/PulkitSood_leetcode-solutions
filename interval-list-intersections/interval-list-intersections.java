class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int f = 0 ;
        int s = 0;
        
        int fl=firstList.length;
        
        int sl=secondList.length;
        
        List<int[]> ans = new ArrayList();
        
//         i need to form a new list of the intersections 
//         an intersection = one from f and one from s 
//         can the intersection join ? - no as the above two dont join the intersection can never join 
//         so ineed to move my f and s pointers acc to the conditions  and thats it 
        
        while (f<fl && s<sl){
        int[]first  = firstList[f];
        int[]second = secondList[s];
//             1. find out who is smaller 
        
                int left = Math.max(first[0],second[0]);
                int right = Math.min(first[1],second[1]);
            if (right>=left)
                ans.add(new int[]{left,right});
            
            if (first[1]>second[1])
                s++;
            else 
                f++;
            
        }
        return ans.toArray(new int [ans.size()][]);
    }
}