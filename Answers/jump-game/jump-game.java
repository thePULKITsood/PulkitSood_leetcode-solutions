class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
//         boolean[] arr = new boolean[n];
        
//         arr[n-1]=true;
//         for (int i = n-2;i>=0;i--){
            
//             int dis = nums[i];
//             for (int j = i+1; j <= i+dis && j<n ; j++){
//                 if(arr[j]==true)
//                 {
//                     arr[i]=true;
//                     break;
//                 }
//             }
            
//         }
//         return arr[0];
        
        int last = n-1;
        
        for (int i = n-2;i>=0;i-- ){
            if(i+nums[i]>=last)
                last=i;
        }
        return last==0;
    }
}