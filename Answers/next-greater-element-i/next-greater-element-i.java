class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack ();
        Map<Integer, Integer> map = new HashMap() ;
        
        int n = nums2.length;
       
        
        for (int i = 0 ; i < n ; i++)
        {
            while (! st.isEmpty() && nums2[i] > st.peek() )
                map.put(st.pop(),nums2[i]);
            
            st.push(nums2[i]);
            
        }
        
        while (!st.isEmpty())
            map.put(st.pop(),-1);
        
        int ret[] = new int [nums1.length];
        for (int i = 0; i<nums1.length ; i++){
            ret[i] = map.get(nums1[i]);
            
        }
        return ret;
            
        
    }
}
// just find each ngr for the full array 2 then return the as array buld using hashmap 

