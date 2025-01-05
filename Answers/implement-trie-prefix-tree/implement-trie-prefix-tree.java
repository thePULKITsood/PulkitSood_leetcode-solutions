class Trie {

    private class Node {
        Node [] children;
        boolean isEnd;
        
        Node () {
             children = new Node [26];
        }
    }
    
    final private Node root;
    
    public Trie() {
        root = new Node();   
    }
   
    public void insert(String word) {
        
        Node curr = root ;
        for (int i = 0 ;i < word.length() ; i++){
            char ch = word.charAt(i);
            if (curr.children [ ch-'a'] == null ){
//                 means this char is not present 
//                 so insert it there 
                curr.children [ch-'a'] = new Node ();   
            }
            // now if it was not there i have inserted it and if it was there i have not run that statement and i am going to move my curr to the next child - either the newly inserted on e or the old one 
            
            curr = curr.children[ch-'a'];
        }
        
//         when this loop ends i will mark the  curr.isEnd = true;
        curr.isEnd = true;
        
    }
  
    public boolean search(String word) {
        Node curr = root;
        for (int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if (curr.children[ch-'a'] == null ){
                return false ;
            }
//             matlab wo null nahi hai so move forward
            curr = curr.children[ch-'a'];
            
        }
        return curr.isEnd;
        
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0 ; i < prefix.length() ; i++){
            char ch = prefix.charAt(i);
            if (curr.children[ch-'a'] == null ){
                return false ;
            }
//             matlab wo null nahi hai so move forward
            curr = curr.children[ch-'a'];     
        }
        return true;
       
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */