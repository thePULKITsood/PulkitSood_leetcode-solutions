class Solution {
    public int arraySign(int[] nums) {
        int neg = 0 ;
        int zero = 0;
        
        for (int n : nums){
            if(n<0)
                neg++;
            
            if(n==0)
                zero++;
        }
        if(zero>0)
            return 0;
        else if(neg %2 ==1 ) 
            return -1 ;
        else return 1 ;
            
    }
}