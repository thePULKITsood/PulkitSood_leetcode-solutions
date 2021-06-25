class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        {
// //         consider the set of words that do not croos the linmit of the letter hashmap 
// //   then from those set of words we will fins the max score made by the words from the score array 
        
// //          two tasks 
// //          1 . selecting all the possible iteration of words wuch that the letter limit is honoured 
// //          2. calculating th e max value of the final words selcted and updating the max variable  and returning the max variable 
        
// //          first funciton - pass words and letter hashmap 
//    // = > files up the array include  
        
// //          and in the base case i pass the inclued array to the find score funciton (included ,string, score array ) == > give an int score
        
// //         then i caompare that score with the max score and i update the score if req 
        
        
// //  creating a freq array 
//         int []freq = new int [26];
//         for (int i = 0 ; i < letters.length ; i++)
//         {
//             char ch = letters.charAt(i);
//             int index = ch-'a';
//             freq[index] +=1;
//         }
//         boolean includes [] = new boolean [words.length()];
//         helper (words, includes , freq , 0);
        
//     }
//     private void helper (String [] words , boolean [] includes , int [] freq  , int index )
        
//     {
//         String word = words[index];
// //         we will add the index word if it full filss the criteria 
//         for (int i = 0 ; i <word.length();i++)
//         {
//             if (freq[word.charAt(i) - 'a'] )
//         }
        
//     }
    }
        
//          first we make a freq array 
        int freq []  = new int [26];
        
        for (char ch : letters)
        {
            freq[ch - 'a'] ++;
        }
        
//          now make a call to back track function 
        int ans = backtrack (words , freq , score , 0);
        return ans; 
    }
    
    public int backtrack (String []words , int [] freq, int []score , int idx )
    {
        // base case 
        if (idx== words.length)
        {
            return 0 ;
        }
//          we have two situations 
//         we will not  add the word in our score 
        
        int notadd = backtrack(words,freq,score,idx+1);
        
//         we will add the word and we have to check wheteher the word is addable 
//         by checking the frequency array 
//          to add we must first find the score related to that word 
//          while finding the score we will also find through a boolean flag if the word is valid or not 
//         if it is valid we will make a call as already chnges have been made 
//          if not valid we will not make a call 
//         after that we will revert the changes 

        int sword =0;
        int add=0;
        
        boolean isvalid  = true;
        
        char[] word = words[idx].toCharArray();
        
        for (char ch :  word )
        {
           if (freq[ch-'a']==0) isvalid= false;
            
            sword += score [ch-'a'];
            freq[ch-'a']--;
        }
        if (isvalid )
        {//              i can make a call 
            add = sword + backtrack (words,freq,score,idx+1);
        }
        for (char ch :  word )
        {
            freq[ch-'a']++;
          } 
        

  return Math.max(notadd,add);      
        

    }
    
}





















