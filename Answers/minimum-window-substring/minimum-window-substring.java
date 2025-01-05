class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap();
        HashMap<Character,Integer> tmap=new HashMap();
        
        for (char c : t.toCharArray()){
         
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        int need = t.length();
        int have = 0;
        
        int left =0;
        int right =0;
        
        int ansStart =0;
        int ansEnd = 0;
        
        String ans="";
        while (true){
            boolean f1=true;
            boolean f2=true;
            //acquire till i have the correct have == need 
            while (right < s.length() && have<need){
                char ch = s.charAt(right);
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                
                if(tmap.containsKey(ch) && smap.get(ch)<=tmap.get(ch))
                    have++;
               
                right++;
                f1=false;
            }
            
            // release and collect answers till the have == need 
            while (left<right && have>=need){
                String pans = s.substring(left,right);
                if(ans.length()==0 || ans.length()>pans.length())
                    ans = pans;
                
                char ch = s.charAt(left);
                smap.put(ch,smap.get(ch)-1);
                
                if(tmap.containsKey(ch) && smap.get(ch)<tmap.get(ch))
                    have--;
                
                left++;
                f2=false;
            }
            if(f1 && f2)break;
            
            
        }
        return ans;
    }
}