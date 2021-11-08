class Solution {
    List<String> result = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        HashSet <String > set = new HashSet<>(wordDict);
        // for (String str :wordDict)
        // {
        //     set.add(str);
        // }
        backtrack(s,set,"");
        return result;
    }
    public void backtrack(String str,HashSet <String > set , String ans )
    {
        if (str.length()== 0 )
        {
            ans = ans.substring(0,ans.length()-1);
            result.add(ans);
            return ;
        }
        for (int i =0;i<str.length() ; i++)
        {
            String left = str.substring (0,i+1);
            if (set.contains(left))
            {
                String right = str.substring (i+1);
                backtrack(right,set,ans+left+" " );
            }
        }
    }
}