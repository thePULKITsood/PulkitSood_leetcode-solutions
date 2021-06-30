class Solution {
    public boolean isHappy(int n) {
        HashSet seen  = new HashSet ();
        
        if (n==1) return true;
        seen.add(n);
        
        while (true)
        {
//         creating new n 
        int newn = 0;
        
        while (n!=0){
            int rem = n%10;
            newn +=  rem * rem ;
            n = n/10;
        }
            
        n = newn;
            
        if (n==1) return true;
        if (seen.contains(n)) return false ;
        seen.add(n);
        }
        
    }
}