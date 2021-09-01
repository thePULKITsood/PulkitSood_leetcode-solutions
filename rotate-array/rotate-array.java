class Solution {
    public void rotate(int[] nums, int k) {
        
        
        int n = nums.length;
        k=k%n;
        
        reverse (nums,n-k,n-1);
      
        reverse (nums,0,n-k-1);
        reverse (nums,0,n-1);
    }
    int [] reverse (int []nums,int start , int end ){
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end --;
        }
        return nums;
    }
}
  // 4th index 
        //     n=7 
        //     7-3 = 4;
        