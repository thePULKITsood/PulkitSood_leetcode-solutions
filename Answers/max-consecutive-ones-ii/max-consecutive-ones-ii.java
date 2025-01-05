class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left =0;
        int right =0;
        int zero=0;
        int max=0;
        
        while(right<nums.length){
            if(nums[right]==0)
                  zero++;
            
        while(left<=right && zero>=2){
             if(nums[left]==0)
                  zero--;
                        
             left++;
            }
            right++;
            max=Math.max(max,right-left);
        }
        return max;
        
    }
}
// brute - flip one zero and find the max then flip other
//make an array and store the number of ones  and store if it has one zero after it or not

//then go through all ones if  they have one zero after them then add the next one ancd continue this 

//or i can do this with sliding window 

// while true 
// find the size of this window  - then see how many zeros next - if one save the window 
// if more than dont save  make it =1 

// if yes zero find the next window when it is over check and add the ans and modify max