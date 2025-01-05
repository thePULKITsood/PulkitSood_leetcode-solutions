class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int arr[] = new int [n+1];
        for (int i = 0 ;i<n ; i++){
            if(s.charAt(i)=='I'){
                arr[i]=low;
                low++;
            }
            else {
                arr[i]=high;
                high--;
            }
        }
        arr[n]=high;
        return arr;
        
        
    }
}
//       I D I D 
// int 0 4 3 2 1
// inc   2 1 1 0  
// dec   2 2 1 1 