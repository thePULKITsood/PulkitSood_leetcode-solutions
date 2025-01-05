class Solution {
    int n ;
    public List<Integer> pancakeSort(int[] arr) {
//         find the value to place 
//         then make it first 
//         then make it last 
        
         n = arr.length;
        int large = n ;
        
        List<Integer>  ans = new ArrayList();
        
        for (int i = n-1; i>=0 ; i--){
            
            int idx = findmax(arr,large);
            
            flip(arr,idx);
            flip(arr,large-1);
            
            ans.add(idx+1);
            ans.add(large--);
            
        }
        return ans;
    }
    
    int findmax(int []arr , int large){
        
        for (int i = 0;i<n ; i++){
            if(arr[i] == large)
                return i;
        }
        return -1;
        
    }
    void flip (int[]arr , int k ){
//         flip all the first k elements 
        int i = 0 ; 
        int j = k; 
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}