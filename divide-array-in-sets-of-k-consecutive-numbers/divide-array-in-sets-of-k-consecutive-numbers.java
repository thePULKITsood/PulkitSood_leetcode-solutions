class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int len = nums.length;
        if(len%k!=0)return false;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            minHeap.add(i);
        }
        
        while(minHeap.size() != 0) {
            
            int start = minHeap.poll();
            
            for(int j = 1; j < k; j++){
                
                if(minHeap.remove(start + j)) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    
        
    }
}