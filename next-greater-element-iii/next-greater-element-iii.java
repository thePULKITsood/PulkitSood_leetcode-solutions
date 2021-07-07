class Solution {
    public int nextGreaterElement(int n) {
        
//          1. make the character array 
        char a [] = ("" + n) . toCharArray();
        
//         2. find the first dip 
        int i = a.length - 2;
 
        while (i>=0 )
        {
            if (a[i] >= a[i+1] )
                i--;
            
            else break;
        }
        
        if (i== -1) return -1;
        
//   3.      now find the element we want to replace with -- that is the first element that is larger than this 
        
        int j =  a.length - 1;
  
        while (j>=i)
            
        {    
            if (a[i] >=  a[j] )
                j--;
        
            else break;
        }
        
//         swap i and j ;
        
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        
        
//         get the answer from  0 to i 
        StringBuilder sb = new StringBuilder();
        
        for (int  k = 0; k <= i ; k++)
            sb.append(a[k]);
        
//         now as we want to reverse the string from  the last digits so we add them in reverse ordr in the string builder 
        
        for (int k = a.length-1 ; k > i ; k--)
            sb.append(a[k]);
        
    String ans = sb.toString();
        
        Long lans = Long.parseLong(ans);
         
        if (lans> Integer.MAX_VALUE) return -1;
       
        else {
            int in =  lans.intValue();
            return in ;
        }
        }
    
}