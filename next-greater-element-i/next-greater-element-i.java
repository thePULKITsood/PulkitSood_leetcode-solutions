class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map <Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        int n = nums2.length;
        
       
        
        for (int i = n-1 ; i>=0 ; i--){
            // -  ans + 
            
            while (!stack.isEmpty() &&  stack.peek()< nums2[i])
                stack.pop();
            
            map.put(nums2[i] , stack.size() == 0 ? -1 : stack.peek() );
            
            stack.push(nums2[i]);
        }
        
        int ans[] = new int [nums1.length];
        
        for (int i = 0 ; i < nums1.length ; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
        
    }
}
// we can either fill the stack going from right to left more intuitive or from left ot right 
