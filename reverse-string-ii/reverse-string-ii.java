class Solution {
    char arr[] ;
    public String reverseStr(String s, int k) {
     arr = s.toCharArray();
        
        int n = s.length();
        if (k>n)k=n;
        
        for (int i = 0 ; i < n ; ){
            
            if (n-i +1 >= 2*k)
            {
                rev(i, i + k -1);
                i=i+k+k;
            }
            
            else if (   n- i + 1 < 2*k &&  n-i+1 >= k)
            {
                rev(i,i+k-1);
                i=n+1;
                break;
            }
            else if (n-i+1 < k ){
                rev (i ,n-1);
                i=n+1;
                break;
            }
            // else {
            //     break;
            // }
        }
        String ans = String.valueOf(arr);

        return ans;
        
    }
    public void  rev(int i , int j){
        while (i<j){
            char temp = arr[i];
                arr[i]=arr[j];
            arr[j] = temp;
                    
            
            i++;
            j--;
        }
    }
}