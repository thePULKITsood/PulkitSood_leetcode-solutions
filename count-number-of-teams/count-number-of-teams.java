class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int res=0;
        for (int i =0;i<n;i++){
            int leftsmall=0;
            int rightsmall=0;
            int leftbig=0;
            int rightbig=0;
            
            //left 
            for(int j = 0 ; j < i ;j++){
                if(rating[j]>rating[i])
                    leftbig++;
                else leftsmall++;
            }
            //right 
            for (int j=i+1;j<n;j++){
                if(rating[j]>rating[i])
                    rightbig++;
                else rightsmall++;
            }
            
            
            
            
            
            res+=leftsmall*rightbig + rightsmall*leftbig;
        }
        return res;
        
    }
}
// find the number of increasing subsequences length 3 - from the left and from the right 