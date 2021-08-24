class Solution {
    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        if(n == 0)
            return 0;
        //priorityQ of score and index 
        
        PriorityQueue< int[] >pq = new PriorityQueue<>((a,b)-> (b[0]-a[0]));
        pq.add(new int []{nums[0],0});
        int max =nums[0];
        
        for (int i = 1 ; i<n ; i++ ){
            while (pq.peek() [1] < i-k)
                pq.remove();
            
            int curr[] = pq.peek();
         max = curr[0]+nums[i];
            pq.add(new int []{max,i});
        }
        return max;
        
    }
}