class Solution {
    public String longestWord(String[] words) {
    Set <String>set = new HashSet();
        for(String s:words){
            set.add(s);
        }
        set.add("");
        Arrays.sort(words,(a,b)-> a.length()== b.length()? a.compareTo(b): b.length()-a.length());
        
        for (String s:words){
            StringBuilder sb = new StringBuilder(s);
            while (sb.length()>0){
                if(set.contains(sb.toString())){
                    sb=sb.deleteCharAt(sb.length()-1);
                }
                else {
                    break;
                }
            }
            if(sb.length()==0)
                return s;
        }
        return "";
        
    }
}
//sort the list lexiographically then for eacch string check if we have the prefixes in the set 