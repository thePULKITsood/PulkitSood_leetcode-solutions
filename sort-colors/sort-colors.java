class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        /*
//         we will keep pointers i j and k 
        int n = nums.length;
        
        int i = 0;
        int j = 0 ;
        int k = n-1;
        
        //i must be at the last 1 
        
        while (j<=k){
            
            if(nums[j]==1)
                j++;
            
            else if (nums[j]==0){
                //swap i and j 
                // then i ++ j++
                // if(i==j)continue;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
                
                i++;
                j++;
            }
            else if (nums[j]==2){
                nums[j]=nums[k];
                nums[k]=2;
                k--;
            }
        }
        */
        
    }
}