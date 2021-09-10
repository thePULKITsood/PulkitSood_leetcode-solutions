class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for (int i=0;i<n;i++){
            if(i%2==1)
            {
                //swap odd and at i+1
                // if not present do nothing
                if(i+1<n){
                    int temp = nums[i+1];
                    nums[i+1]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        
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