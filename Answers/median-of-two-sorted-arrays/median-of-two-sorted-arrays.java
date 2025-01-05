class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
       
        if(num2.length<num1.length )return findMedianSortedArrays(num2,num1);
        
        int n1=num1.length;  // 2 
        int n2= num2.length; // 1 
        
        int len = n1+n2;  //3 
        
        int lo = 0; 
        int hi = n1; //2 
        
        while (lo<=hi){ 
            int cut1 = (lo+hi)/2;  // how many elements i will take from arr 1  // 1  
            int cut2 = (len+1)/2 - cut1; // how many elements in the left half will i take from arr 2 // 1 
 
            // now l1 , l2 , r1 , r2 
            
            int l1 = cut1==0 ? Integer.MIN_VALUE : num1[cut1-1]; // as arrays are 0 indexed   // 1
            int l2 = cut2==0 ? Integer.MIN_VALUE : num2[cut2 - 1]; // as arrays are 0 indexed // 2 
            int r1 = cut1==n1 ? Integer.MAX_VALUE : num1[cut1]; // as arrays are 0 indexed    // 3
            int r2 = cut2==n2 ? Integer.MAX_VALUE : num2[cut2]; // as arrays are 0 indexed    // max
            
            
            //now the binary search part 
            
            if(l1 <= r2 && l2<=r1){
                // we are at the correct part now return the min 
                if(len %2 ==0){
                    int ans = Math.max(l1,l2) + Math.min(r1,r2);
                    return (ans/2.0);
                }
                else {
                    return Math.max(l1,l2);
                }
                
            }
            else if (l1>r2){
                //means the last of num1s left part is greater than first of num2s right part then 
                // we must decrease the cut 1 or num1s left part
                
                hi=cut1-1;
                
            }
            else {
                lo=cut1+1;
            }
            
            
        }
        return 0.0;
    }
}

/*

left part len = len/2  // if len ==6  then left part =3 
 
 if len ==7  then left parts length must be 4 so thats why we do (len+1)/2 
 
 now we have the len of left part 
 
 cut 1 = number of elements form first array
 cut 2 = number of elements from 2nd array -> it it equal to leftpart - cut1 
 


to pick 2 elements from num1 for the left part 
cut1 ==2 
thus the left 1 will be arr[cut1-1]  num1[1] -> as our cut1 will be one more than the actual index;


*/