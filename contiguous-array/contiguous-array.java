class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        
        int one =0;
        int zero = 0;
        int diff=0;
        int max=0;
        for (int i=0;i<nums.length ; i++){
            if(nums[i]==1)
                one++;
            else zero++;
        
             diff = one-zero;
            
            if(diff==0)
                max=i+1;
            
            if(map.containsKey(-diff))
                max=Math.max(max, i- map.get(-diff));
            
            if(!map.containsKey(-diff))
                map.put(-diff,i);
        }
    return max;
    }
}