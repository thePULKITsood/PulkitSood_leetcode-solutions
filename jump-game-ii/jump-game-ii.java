class Solution {
    public int jump(int[] nums) {
        int min =0;
        int max =0;
        int n = nums.length;
        int num=0;
        
        while (max<n-1){
            
            int newmax= max;
            
            //basically the starting point must be between the left ans the right 
            for (int i=min;i<=max;i++){
                newmax=Math.max(newmax,i+nums[i]);
                
            }
            
            min = max+1; //as wehave scanned all til max so we must go from max +1 now 
            max=newmax;
            num++;
                
        }
        return num;
        
    }
}