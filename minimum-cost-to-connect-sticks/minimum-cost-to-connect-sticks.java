class Solution {
    public int connectSticks(int[] sticks) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        
          // add all sticks to the min heap.
        for (int stick : sticks) {
            pq.add(stick);
        }
        
        while (pq.size()>1){
            int stick1 = pq.remove();
            int stick2 = pq.remove();
            
            int cost = stick1 + stick2;
            ans += cost;
            
            pq.add(stick1 + stick2);
        }
        return ans;
    }
}