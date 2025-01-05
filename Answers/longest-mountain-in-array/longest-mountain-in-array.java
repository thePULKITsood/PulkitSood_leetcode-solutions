class Solution {
    public int longestMountain(int[] A) {
        int res = 0;
        int n = A.length;
        
        for (int i =1;i<n;i++){
            //for each i search the mountain 
            
            int count = 1 ;
            boolean flag=false;
            int j=i;
            //and move the i to the next peak 
            
            //increasing sequence
            while(j<n && A[j]>A[j-1]){
                count++;
                j++;
            }
            
            //decreasing sequence
            //if i==j that means there ws no indreasing sequence 
            
            while (i!=j && j<n && A[j]<A[j-1])
            {
                count++;
                j++;
                flag=true;
            }
            //max length
            
            if(i!=j && flag && count>2){
                res=Math.max(res,count);
                j--;
            }
            i=j;
            
        }
        return res;
        
    }
}
/*
simple solution ->
make each element as centre and 
first check right -> if all are small at right  and then check left if all are small at left 


*/