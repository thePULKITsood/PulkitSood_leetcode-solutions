class Solution {
    public int totalHammingDistance(int[] nums) {
        int n=nums.length;
        int ans =0;
        for (int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
               
                 int xor = nums[i]^nums[j];
         
            ans+= Integer.bitCount(xor);
            
            }
        }
        return ans;
        
    }
    // int findzeros(int a){
    //     int zeros=0;
    //     while(a>0){
    //         if(a%2==1)
    //             zeros++;
    //         a/=2;
    //     }
    //     return zeros;
    // }
}


/*
0100
1110

1010 -> number of zeros 

*/