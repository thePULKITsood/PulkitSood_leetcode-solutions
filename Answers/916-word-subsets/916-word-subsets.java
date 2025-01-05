class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        // 1. convert words2 into a 26 array 
        
        // 2. convert each word into a 26 array and check it 
        
        // 3. if the each word has more words or not 
        
        List<String> ans = new ArrayList();
        
        int [] arr = new int [26];
        
        for (String word: words2){
            
            int []wordarr = getNewArr(word);
            
            for(int i=0;i<26;i++)
                arr[i]=Math.max(arr[i],wordarr[i]);
            
        }
        
        for (String word : words1){
            
                int[] wordArr =getNewArr(word);
                int i =0;
                    
                for (;i<26;i++)
                  if(wordArr[i]<arr[i]) break;
            
              if(i==26)
                ans.add(word);
        }
        return ans;
    }
    public int[] getNewArr(String S) {
        int[] ans = new int[26];
        for (char c: S.toCharArray())
            ans[c - 'a']++;
        return ans;
    }
}

// make words of word 2 as a 26 array and save the number of words

// then for each word in word 1 check convert and check if it is more than that or not 