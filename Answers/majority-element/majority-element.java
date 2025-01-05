class Solution {
    public int majorityElement(int[] nums) {
        int count = 1 ;
        int ele =nums[0];
        
        for (int i = 1 ; i < nums.length ; i++){
            if(nums[i]!= ele){
                
                count --;
                
                if(count == 0){
                    count = 1; 
                    ele = nums[i];
                }
            
            }
            
            else 
                count ++;
        }
        return ele;
    }
}