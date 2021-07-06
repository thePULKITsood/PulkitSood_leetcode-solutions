// 1. we are going to impliment one simple stack 
// we will use (==-1 and ) == 0 as flags  so that we can use both char and integer in one stack  

// 2. when we see ( we push -1  

// 3.when we see ) we 
//    3.1 add all the numbers until -1 is found 
//    3.2 then multiply the score with 2 and push the score again
   
// 4. at the end we return stack.pop

class Solution {
    public int scoreOfParentheses(String s) {
    Stack<Integer> st = new Stack();
    
        char [] arr = s.toCharArray();
        for (char ch : arr){
            if (ch =='('){
                st.push(-1);
            }
            else 
            {
                int score  =0;
                
                while (st.peek()!= -1){
                    score += st.pop();    
                }
                st.pop();
//                 popping the stack (
                
//                 now two cases either score == 0 or it is something so we will push 
                
//              and we have to multiply the score with two also 
                score = Math.max(1, score*2);
                st.push(score);
                
            }
        }
        int ans = 0;
        while (!st.isEmpty())
            ans+=st.pop();
        
        return ans;
    }
}