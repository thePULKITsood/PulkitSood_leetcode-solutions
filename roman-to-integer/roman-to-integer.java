class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> map = new HashMap();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        Stack<Integer> st = new Stack();
        
        for(char c : s.toCharArray()){
            
            int num =map.get(c);
            
            while(! st.isEmpty() && st.peek()< num)
            {
                num -= st.pop();
            }
            st.push(num);
        }
        int sum =0;
        while(!st.isEmpty())
            sum+=st.pop();
        
        return sum;
    }
}

// basically stack 

// put in stack 
// when putting see if the number i am going to put is > top if yes pop the top sub  it and put the thing on the stack 