class Solution {
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        List <String> ans = new ArrayList();
         for(int i = 1; i<4 && i<n-2; i++){
            for(int j = i+1; j<i+4 && j<n-1; j++){
                for(int k = j+1; k<j+4 && k<n; k++){
                    
                    String s1 =s.substring(0,i);
                    String s2 =s.substring(i,j);
                    String s3 =s.substring(j,k);
                    String s4 =s.substring(k,n);
                    
                    if(isValid (s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                      ans.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        
     return ans;
    }
    boolean isValid(String s){
        if(s.length()>3 || s.length ()==0 || (s.length()>1 && s.charAt(0)=='0') || Integer.parseInt(s)>255)
            return false;
        return true;
    }
}
  








// i will create a backtracking function and i will put one dot in the function
        
        
        //get the string 
        // put one dot after the prev dot + 1 
        
        // put one dot after the prev dot + 2 
        
        // put one dot after the prev dot + 3
        
        // make a call to the function with the dots reduced
            
        // in the base case check the portion between the two recent dots - if it is valid  continue if not then return 
//         if all dots are placed return that string