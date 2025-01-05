class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
      
        int sum =0;
        for (int i:arr)
            sum+=i;
        
        if(sum%3!=0)return false;
        int ans=0;
        int current =0;
        
        int n = arr.length;
        
        for (int i=0;i<n;i++){
            current +=arr[i];
            int temp = sum-current;
            if(temp%2==0 && temp/2==current){
                //finc the next 
                int second = 0;
                for (int j=i+1;j<n-1;j++){
                    second+=arr[j];
                    if(current == second && current == temp-second)
                        ans++;
                }
            }
            
        }
        
        if(ans>=1)
            return true;
        return false;
        
    }
}