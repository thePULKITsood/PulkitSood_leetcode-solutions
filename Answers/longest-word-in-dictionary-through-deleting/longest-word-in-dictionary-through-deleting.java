class Solution {
    public String findLongestWord(String s, List<String> dic) {
        Collections.sort(dic, (a,b)-> b.length()-a.length());
        List<String> ans = new ArrayList();
        int max=0;
        
        for (int i = 0 ;i < dic.size();i++){
           //dont make a map just compare as it is with two pointers for string
            // and stop at the first true comparison
            
            String comp = dic.get(i);
            
            int cp=0;
            int sp=0;
            
            while(cp<comp.length() && sp<s.length()){
                if(comp.charAt(cp) == s.charAt(sp))
                {
                    cp++;
                    sp++;
                }
                else{
                    sp++;
                }
            }
            if(cp==comp.length())
            {
                if(comp.length()>max){
                    ans=new ArrayList();
                    ans.add(comp);
                    max=comp.length();
                }
                else if (comp.length()==max){
                    ans.add(comp);
                }
            }
        }
        Collections.sort(ans);
        if(ans.size()==0)return "";
        return ans.get(0);
        // return "";
    }
}
//1.sort the dictionary by decreasing length 
//2 . make the string char array and the schar array match them one by one 