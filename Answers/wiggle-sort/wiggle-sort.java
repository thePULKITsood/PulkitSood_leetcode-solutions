class Solution {
    public void wiggleSort(int[] nums) {
        
        int n=nums.length;
        for (int i=0;i<n-1;i++){
            if (i%2==0){
                //even;
                if(nums[i]>nums[i+1])
                    swap(i,i+1,nums);
            }
            else {
                if(nums[i]<nums[i+1])
                    swap(i,i+1,nums);
                
            }
        }
    
      
            
        }
        
    
   public void swap ( int i , int j , int [] nums){
                   int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
    }
}
/*
number at odd place is bigger than left and right

[6,6,5,6,3,8]
3 5 6 6 6 8 
3 6 5 6 6 8 

[3,5,2,1,6,4]

 1 2 3 4 5 6
 1 3 2 5 4 6
 
*/