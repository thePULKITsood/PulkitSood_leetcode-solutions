class WordDictionary {

    private class Node {
        Node[]children;
        boolean isEnd ;
        
        Node (){
            children = new Node[26];
        }
    }
   
    final private Node root ;
    
    public WordDictionary() {
        root = new Node ();
        
    }
    
    public void addWord(String word) {
        Node curr = root ;
        
        for (int i=0 ; i< word.length ();i++){
            char ch = word.charAt(i);
            if (curr.children[ch-'a'] == null)
                curr.children[ch-'a'] = new Node ();
            curr = curr.children[ch-'a'];
            
        }
        curr.isEnd =true;
    }
    
    public boolean search(String word) {
        
        // now if the ch == '.' i need to loop through all the possibilities and do a dfs so it  must become a helper func 
       return  help(word, this.root ,0);
      
    }
    private boolean help (String word, Node root ,int index){
        Node curr = root;
        
        if (index == word.length()) return curr.isEnd;
        
        char ch =word.charAt(index); 
        
        if (ch !='.'){
            if (curr.children[ch-'a'] == null ) return false ;
            else return help (word,curr.children[ch-'a'] , index + 1 );
        }
        else 
        {
            for (Node n : curr.children){
                if (n != null ){
                    if (help(word,n,index + 1)) return true;
                }
            }
        }
    return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */