/**
    1. Thoughts
        - from back to front
        - if count > 0 && != #, skip
        - if count == 0 && different, return false
        - if #, count++
        - if one ends, the other count == 0 && has any char return false
        - else return true
*/

class Solution {
    public boolean backspaceCompare(String s, String t) { 
        // i have to do it using the two pointer approach 
        
        int i = s.length()-1;
        int j = t.length()-1;
        
        int ss = 0;
        int st = 0;
        
        while (i>=0 || j >=0){
           while (i>=0){
               if (s.charAt(i) == '#') {ss++;i--;}
               else if (ss>0) {ss--; i --; }
               else break;
               
           }
             while (j>=0){
               if (t.charAt(j) == '#') {st++;j--;}
               else if (st>0) {st--; j --;}
               else break;
               
           }
            
            if (i>=0 && j>=0 && s.charAt (i) == t.charAt(j))
            {
                i--;
             j--;
            }
            else break;
            
        }
        return i==-1 && j==-1;
    }
}