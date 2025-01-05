class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0 ;
        int count2 = 0 ;
        
        Integer ele1 = null;
        Integer ele2 = null;
        
        for (int n : nums){
            if (ele1 != null && n == ele1 )
                count1++;
            
            else if (ele2 != null && n == ele2 )
                count2 ++;
            
            else if (count1 == 0 ){
                ele1 = n;
                count1 ++;
            }
            else if (count2 == 0){
                ele2 = n;
                count2 ++;
            }
            else {
                count1 -- ;
                count2 -- ; 
            }
                 
            
        }
        
        
        List result = new ArrayList <> ();

        count1 = 0;
        count2 = 0;

        for (int n: nums) {
            if (ele1 != null && n == ele1) count1++;
            if (ele2 != null && n == ele2) count2++;
        }

        int n = nums.length;
        if (count1 > n/3) result.add(ele1);
        if (count2 > n/3) result.add(ele2);

        return result;
        
    }
}