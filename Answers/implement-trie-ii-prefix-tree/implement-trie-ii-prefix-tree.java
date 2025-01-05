class Trie {
  private class Node {
        Node [] children = new Node [26];
        int  isEnd;
        int count ;
    
     
    }
   final private Node root;
    
    public Trie() {
        root = new Node();   
    }
          // We are iterating through each word character and if Node doesn't have a child we will add it.
		// on each step after adding/stepping the node we increment prefix count
		// after last step we add to words end's counter
    
    public void insert(String word) {
        
         Node curr = root ;
        
        for (int i = 0 ;i < word.length() ; i++){
            char ch = word.charAt(i);
            if (curr.children [ ch-'a'] == null ){
  
                curr.children [ch-'a'] = new Node ();   
            }
          
            
            curr = curr.children[ch-'a'];
            curr.count ++;
        }
        

        curr.isEnd ++;
    }
    
       // We are iterating through each word character and if Node doesn't have a child we return 0.
		// In case we iterated entire word, just return end's counter
    
    public int countWordsEqualTo(String word) {
         Node curr = root;
        
        for (int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            
            if (curr.children[ch-'a'] == null ){
                return 0 ;
            }
//             matlab wo null nahi hai so move forward
            curr = curr.children[ch-'a'];
            
        }
        return curr.isEnd;
        
    }
    
    public int countWordsStartingWith(String prefix) {
        
        Node curr = root;
        
        for (int i = 0 ; i < prefix.length() ; i++)
        {
            char ch = prefix.charAt(i);
            
            if (curr.children[ch-'a'] == null )
            {
                return 0 ;
            }

            curr = curr.children[ch-'a'];     
        }
        return curr.count;
    }
    
    
    // We are iterating through each word character and if Node doesn't have a child we return
		// In case we iterated entire word, just decrement end's counter
    public void erase(String word) {
          Node curr = root ;
        
        for (int i = 0 ;i < word.length() ; i++){
            char ch = word.charAt(i);
           curr = curr.children[ch-'a'];
          curr.count--;
        
        }
        

        curr.isEnd --;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * int param_2 = obj.countWordsEqualTo(word);
 * int param_3 = obj.countWordsStartingWith(prefix);
 * obj.erase(word);
 */