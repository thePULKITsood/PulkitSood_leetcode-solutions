class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack ();
        
        int n = nums2.length;
        int ans [] = new int [n];
        
        Arrays.fill(ans,-1);
        
        for (int i = 0 ; i < n ; i++)
        {
            while (! st.isEmpty() && nums2[st.peek()] < nums2[i] )
                ans[st.pop()] = i;
            
            st.push(i);
            
        }
        
        Map<Integer, Integer> map = new HashMap() ;
        for (int i = 0 ; i< n ; i++){
            map.put(nums2[i],ans[i]==-1 ? -1 : nums2[ans[i]]);
        }
        int ret[] = new int [nums1.length];
        for (int i = 0; i<nums1.length ; i++){
            ret[i] = map.get(nums1[i]);
            
        }
        return ret;
            
        
    }
}
// just find each ngr for the full array 2 then return the as array buld using hashmap 

