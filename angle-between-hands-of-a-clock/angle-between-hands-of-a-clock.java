class Solution {
    public double angleClock(int hour, int minutes) {
        
//         hours - 0 - 11 
//             then 1 hour will have 60 subdivision 
            
//             for example 12 
//                 12==0 
//                 12.20
    
//                 0 + 20 
//                 =20 out of 12*60
                
//                 minutes =20 out of 20 
                
//                 now i have to see where is teh minute hand out of 12*60 places 
//                 10 min = 120 
                
//                 transform minutes 
                
//                 20 minutes = 20 *60 = 120 
//                 12:20 = only 20 
                    
//                     now the angle 
                    
//                     two angles are possible 20-120 
//                     20-120-12*60
 
//                     3 * 60 + 30 
                    
//                     30 *12 =  360
     
//                     if (hour == 12) hour =0;
        
        double  h = hour * 60 + minutes ;
        double m = minutes * 12;
        
        double ans = Math.abs(h-m);
        double other = 720- ans;
        
        ans=ans/2;
        other=other/2;
        return ans<other ? ans :other;
        
    }
}