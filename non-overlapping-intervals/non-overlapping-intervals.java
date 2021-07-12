class Solution {
    public int eraseOverlapIntervals(int[][] iv) {
// if two intervals are overlapping, we want to remove the interval that has the longer end point -- the longer interval will always overlap with more or the same number of future intervals compared to the shorter one
        
// //         this covers all the 3 cases 
//         1. they dont over lap 
//             2. delete the 2nd one overlapping
//             3. delete the bigger one who is engulfing the second one 
        
        Arrays.sort(iv ,(a,b) -> Integer.compare(a[0],b[0]));
        int n = iv.length;
        
        int count = 0;
        
        int last[] =iv[0] ;
        for (int i = 1 ; i< n ; i++){
            
            if (last[1] > iv[i][0]){
                // if the ending of the last is greater than the starting of the new one then
//                 we are going ot remove one - which one we will see 
            count ++;
//                 we will remove the one whose ending is maximum 
                if (last[1] > iv[i][1])
                    last = iv[i];
//                 last deleted ;
                else {
//                     last remains same 
                }
            
            }
            else {
                last = iv[i];
            }
        }
        return count ;
    }
}