class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        
        int prefix [] = new int [n];
        int postfix [] = new int [n];
       
        prefix[0]=nums[0];
        
        for (int i = 1; i< n ;i++){
            prefix [i] = prefix[i-1] + nums[i];
        }
        
        postfix[n-1] = nums[n-1];
        
        for (int i = n-2; i>=0 ;i--){
            postfix [i] = postfix[i+1] + nums[i];
        }
        
        for (int i = 0 ;i< n ; i++){
            
            if(i==0)
                nums[i]=postfix[i+1] - nums[i]*(n-1-i);
            
            else if (i== n-1)
                nums[i] = (nums[i]*i ) - prefix[i-1];
            
            else {
             int ans = (nums[i]*i) - prefix[i-1];
                ans+= postfix[i+1] - (nums[i]*(n-1-i));
                nums[i]=ans;
            }
            }
        return nums;
    }
}