class Solution {
    public int findPairs(int[] nums, int k) {
          int result = 0;

        HashMap <Integer,Integer> counter = new HashMap<>();
        for (int n: nums) {
            counter.put(n, counter.getOrDefault(n, 0)+1);
        }
     int ans=0;
        
        for (int x : counter.keySet()){
            if(k>0){
                if(counter.containsKey(x+k))
                    ans++;
                
            }
            else if(k==0)
            {
                if(counter.get(x)>=2)
                    ans++;
            }
        }
        return ans;
    }
}