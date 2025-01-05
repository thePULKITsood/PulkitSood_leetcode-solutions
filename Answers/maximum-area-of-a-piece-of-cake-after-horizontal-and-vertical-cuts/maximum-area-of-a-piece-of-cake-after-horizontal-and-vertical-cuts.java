class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        // 0 hc h
        // 0 vc w
         Arrays.sort(hc);
        Arrays.sort(vc);
        
        long dic = (long)(1e9) + 7;
        
        long hcmax = Math.max(hc[0] - 0 , h- hc[hc.length-1] );
        for (int i = 0;i< hc.length -1 ; i++){
            hcmax = Math.max(hcmax, hc[i+1] - hc[i]);
        }
                             
        long vcmax = Math.max(vc[0] - 0 , w- vc[vc.length-1] );
        for (int i = 0;i< vc.length -1 ; i++){
            vcmax = Math.max(vcmax, vc[i+1] - vc[i]) ;
        }
    
                             return (int)((vcmax *hcmax)%dic) ;
        
    }
}
// as h and w are 1e5 so i can sort 