class Solution {
    public boolean canReach(int[] arr, int i) {
        
        if(i<0 || i>=arr.length || arr[i]<0)
            return false;
//         now to make the thing visistd 
        
        if(arr[i]==0)
            return true;
        
        arr[i] = -arr[i];
        
        
        return canReach(arr,i-arr[i])||canReach(arr,i+arr[i]) ;
    }
}