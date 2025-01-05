class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        Arrays.sort(arr,(a,b)-> {
            if(a[0]==b[0])
                return a[1]-b[1];
            else 
                return b[0]-a[0];
        });
        
      
        int ans=0;
      int max1=arr[0][0];
       int max2= arr[0][1];
        for (int per [] : arr){
            
            if(per[0] < max1){
                
                if(per[1]<max2)
                    ans++;
            }
            max2=Math.max(max2,per[1]);
        }
        return ans;
    }
}
// [[7,9],[10,7],[6,9],[10,4],[7,5],[7,10]]

// 10 7   10 4  7 10  7 9   7 5  6 9    
    
    
// 10 4   10 7  7 5  7 9   7 10  6 9    
    
    