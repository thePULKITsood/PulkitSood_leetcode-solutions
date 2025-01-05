
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int count1[] = new int[1001];
         int count2[] = new int[1001];
        
        for (int n : nums1) {
            count1[n] ++;
        }
        
        for (int n : nums2) {
            if (count1[n] >= 1) {
                count2[n]++;
            }
        }
        
        int size = 0;
        for (int i=0;i<1001;i++){
            size+= Math.min(count1[i],count2[i]);
            count1[i]=Math.min(count1[i],count2[i]);
        }
        
        int ptr = 0;
        int[] results = new int[size];
        
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] > 0 ) {
                while (count1[i] -- >0)
                results[ptr++] = i;
            }
        }
        
        return results;        
    }
}