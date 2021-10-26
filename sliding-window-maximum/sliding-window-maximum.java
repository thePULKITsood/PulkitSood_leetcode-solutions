class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans [] = new int [n-k+1];
        
        Deque<Integer> q = new ArrayDeque();
        
        int i=0;
        int idx=0;
        
        while (i<n){
        // it will store the minimum alues 
        
        // step 1 remove all the values form the fromt which are not relevant to thid windoe 
        
        while (!q.isEmpty() && q.peek()<= i-k  ){
            q.poll();
        }
        
        
        // step 2 remove all values from the top which are smaller than the current value 
        // we are doing this as the q now contains only the values that are for this wondow and the values which are smaleer will never be used so we remove smaller values 
        while (!q.isEmpty() && nums[q.peekLast()]< nums[i]  ){
            q.pollLast();
        }
        
        q.offer(i);
        
        
        
        
        // step 3-  we update the answer array 
        if(i>=k-1)
            ans[idx++]=nums[q.peek()];
        
        i++;
        }
    return ans;
    }
}