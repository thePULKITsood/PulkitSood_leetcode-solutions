class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        
        int ans[] = new int [n-k+1];
        int right =0;
        
        for (int i=0;i<n;i++){
            // remove the elements whic are at the front and no longer part of the sliding window 
            while (dq.size()>0 && dq.peek() <= i-k)
                dq.poll();
            
            
            //no we have only the elements which are part of this sliding window
            //now we will remove all the elements smaller than the current element from the deque
            
            while (dq.size()>0 && nums[dq.peekLast()]<nums[i])
                dq.pollLast();
            
            dq.offer(i);
            
            
            if(i>=k-1){
                ans[right++]=nums[dq.peek()];
            }
        }
        return ans;
        
    }
}