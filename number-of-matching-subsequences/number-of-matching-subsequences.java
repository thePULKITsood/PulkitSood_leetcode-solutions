// class Solution {
    
//    class Node {
//     String word;
//     int index;
//     public Node(String w, int i) {
//         word = w;
//         index = i;
//     }
// }
//     public int numMatchingSubseq(String s, String[] words) {
    
//         int ans =0;
//          ArrayList<Node>[] heads = new ArrayList[26];
//         for (int i = 0; i < 26; ++i)
//             heads[i] = new ArrayList<Node>();
        
//        for (String word: words)
//             heads[word.charAt(0) - 'a'].add(new Node(word, 0));
//             // put it in the head of its first digit  ! 
            
        
        
     
//         for (char c: s.toCharArray()) {
//             // take the character from the bucket [c] -> and add them to 
//             // bucket[node.word.charAt(idx++)-'a']
            
//             ArrayList<Node>  list = heads[c-'a'];
            
//             for (Node node : list){
                
//                 node.index++;
                
//                if (node.index == node.word.length()) {
//                     ans++;
//                }
                
//                 else {
//                     heads[node.word.charAt(node.index) - 'a'].add(node);
//                 }
//             }
//             list.clear();
//         }
//         return ans;
        
//     }
// }

class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        int ans = 0;
        ArrayList<Node>[] heads = new ArrayList[26];
        for (int i = 0; i < 26; ++i)
            heads[i] = new ArrayList<Node>();

        for (String word: words)
            heads[word.charAt(0) - 'a'].add(new Node(word, 0));

        for (char c: S.toCharArray()) {
            ArrayList<Node> old_bucket = heads[c - 'a'];
            heads[c - 'a'] = new ArrayList<Node>();

            for (Node node: old_bucket) {
                node.index++;
                if (node.index == node.word.length()) {
                    ans++;
                } else {
                    heads[node.word.charAt(node.index) - 'a'].add(node);
                }
            }
            old_bucket.clear();
        }
        return ans;
    }

}

class Node {
    String word;
    int index;
    public Node(String w, int i) {
        word = w;
        index = i;
    }
}