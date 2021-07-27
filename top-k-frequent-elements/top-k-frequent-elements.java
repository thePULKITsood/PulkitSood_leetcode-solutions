class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // O(1) time
        
        if (k == nums.length) {
            return nums;
        }
        
        // 1. build hash map : character and how often it appears
        // O(N) time
        
        Map<Integer, Integer> count = new HashMap();
        
        for (int n: nums) {
          count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        PriorityQueue<Integer> heap = new PriorityQueue((a,b)-> count.get(b) - count.get(a));
        
        for (int n : count.keySet())
               heap.add(n);
        
        
        int ans[] = new int [k];
        int i = 0;
        while (k>0){
        ans[i] = heap.remove();
            k--;
            i++;
            
        }
        return ans;
        
        
        
    }
}