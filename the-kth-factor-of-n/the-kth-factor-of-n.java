class Solution {
    public int kthFactor(int n, int k) {
        
        int count = 0;
        
        for (int i=1 ;i <= n ; i++){
            if (n%i == 0 )
            {
                count ++;
                if (count ==k)return i ;
            }
            
        }
        return -1;
    }
}

// suppose we have a list of all the factors of n then i ,ust return the kth factor or return  -1 if it has less than k factors ;
