class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> heap = new PriorityQueue<>((a,b)->{
           if(a.length()==b.length())
            return a.compareTo(b);
            
            else return a.length() - b.length();
        });
        
        for (String s:nums){
            heap.add(s);
            
            if (heap.size() > k)
                heap.remove();
        }
        
        // while (heap.size()>1)
        //     heap.remove();
        
        return heap.remove();
        
    }
}