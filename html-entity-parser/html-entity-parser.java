class Solution {
    public String entityParser(String text) {
        
        HashMap<String, String> map = new HashMap<>();
        map.put("&quot;","\"");
        map.put("&apos;", "'");
        map.put("&amp;", "&");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        
         StringBuilder ans = new StringBuilder(), HTML = new StringBuilder();
        
         boolean and = false;
         char ch[] = text.toCharArray();
        
            for (char c : ch){
                
               if(c == '&') 
                   
              {
                   if (and)//means an and in an and 
                   {
                       ans.append(HTML);
                       HTML = new StringBuilder();
                        HTML.append("&");
                       
                   }
                   else
                   {
                HTML.append("&");
                and = true;
                   }
              }
                
                else 
                {
                if (c ==';' )
                {
                    HTML.append(";");
                    String s = HTML.toString();
                    
                    if(map.containsKey(s))
                        ans.append(map.get(s));
                    else
                        ans.append(s);
                    
                    HTML= new StringBuilder();
                    and = false;
                }
                    else {
                         if(and)
                     
                             HTML.append(c);
                     else
                        ans.append(c);
                    }
                    
                }
                
            }
        return ans.append(HTML).toString();
        
        
        
        
    }
}
//  1. break the string into a string array 
//  2. look for & as open and ; as close and change the values 
//  3. at the end change the values of the & as we do not change it in the  first time 
