class Solution {
    int arr[] ;
    Random rand = new Random();
    
    public Solution(int[] nums) {
        arr=nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return arr;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int copy []= arr.clone();
        int n = copy.length;
        
        for (int i=n-1;i>=0;i--){
        int rand_idx = rand.nextInt(i+1); // generated random no from 0 to n-1
        
        // swap operation 
            
        int temp = copy[i];
        copy[i]=copy[rand_idx];
        copy[rand_idx]=temp;
            
            
        }
        return copy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */