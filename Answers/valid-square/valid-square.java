class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set <Integer> set = new HashSet ();
        set.add(dis(p1,p2));
        set.add(dis(p1,p3));
        set.add(dis(p1,p4));
        set.add(dis(p2,p3));
        set.add(dis(p2,p4));
        set.add(dis(p3,p4));
        
        if (! set.contains(0) && set.size () == 2 )return true;
        return false;
       // we have to check that set must not contain 0 as it is a edge case for our 
    }
    
    private int dis (int[] p1 , int []p2){
//         x1-x2  sq   + y1-y2 sq 
        
        int x = p1[0] -p2[0];
        int y = p1[1] -p2[1];
        return x*x + y*y;
    }
}

// //to check two things 

// the length must be equal and the 4 angles must be equal 
// or we can also check the angle of two diagonals must be 90 then we are good 

