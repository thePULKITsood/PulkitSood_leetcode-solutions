class Solution {
    public int minOperations(String[] logs) {
        
        int deep = 0;
        
        for (String l : logs){
        if (l.equals("../")) 
            
        {
            deep = Math.max(0 , deep-1);
        }   
         
            else if (l.equals("./"))
            {
                //do nothing 
                
            }
            else 
            {deep++;}
        }
        return deep;
    }
}