class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int arr[] = new int [n];
        
        arr[n-1]=0;
        for (int i =n-2 ;i>=0;i-- ){
            
            int dis = nums[i];
            int min = Integer.MAX_VALUE-100;
            
            for (int j = i+1 ; j<=i+dis && j<n ; j++ ){
             min=Math.min(min,arr[j]);   
            }
            arr[i]=min+1;
        }
        return arr[0];
        
    }
}