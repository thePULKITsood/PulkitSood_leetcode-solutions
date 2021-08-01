class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList();
        Set <String> set = new HashSet(wordList);
        
        
        // check if endWord is in set
        if (!set.contains(endWord)) return 0;
        
        // if both are same simply return 1
        if (beginWord.equals(endWord)) return 1;
        
        int count = 1 ;
        
        q.add(beginWord);
           set.remove(beginWord);
        
        while (q.size()>0){
            int size = q.size ();
            
            while (size-- > 0){
                String str = q . remove();
                
                char word[] = str.toCharArray();
                
                for (int i = 0 ;i< word.length; i++){
                    char temp = word[i];
                    
                    for (char c = 'a' ; c<='z' ; c++){
                        word[i] = c;
                        
                        String newWord = new String(word);
                        
                        if(newWord.equals(endWord)) return count +1 ;
                        
                        if(set.contains(newWord)){
                            set.remove(newWord);
                            q.add(newWord);
                            
                        }
                    }
                    word[i] = temp;
                }
                
            }
            count ++;
        }
        return 0;
    }
}