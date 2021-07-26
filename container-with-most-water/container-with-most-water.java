class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        
        int n = height.length;
        
        int l = 0;
        int r = n-1;
        while (l<r){
            
            int min=Math.min(height[l],height[r]);
            
            max=Math.max(max,min*(r-l));
            
            if(height[l]<height[r])
                l++;
            else 
                r--;
        }
        return max;
        
    }
}