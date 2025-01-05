class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1)
        {
            //smallest at the front 
            // all before smallest at the back of end ;
            
            String  min=s;
            for (int i=0;i<s.length();i++){
                String front = s.substring(0,i);
                String back = s.substring(i);
                String ans = back + front;
                if(min.compareTo(ans)>0)
                    min=ans;
               
            }
         
            return min;
            
            
        }
        else {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
            
        
    }
}
//greedy -> choose the largest letter from the k and put it back 

/*
-> when to stop 
1. all characters are the same 
2. 

*/