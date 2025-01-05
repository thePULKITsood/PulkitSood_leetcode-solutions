class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();
        for (String word : words){
            if (match (word,pattern)){
                ans.add(word);
            }
        }
        return ans;
        
    }
    public boolean match (String word, String pattern){
        
        Map <Character, Character> wordToPattern = new HashMap();
        
        Map <Character, Character> patternToWord = new HashMap();
        
        for (int i=0;i<word.length();i++){
            
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            
            if(!wordToPattern.containsKey(w)) wordToPattern.put(w,p);
            
                        if(!patternToWord.containsKey(p)) patternToWord.put(p,w);
            
               if (wordToPattern.get(w) != p || patternToWord.get(p) != w)
                return false;

        }
        return true;
    }
}

// 1. transform each word into pattern 
// check the pattern 

// for each word check two things 
// 1. new letter  - first always 
// 2. letter similar to the last letter 

// if it is a new letter 