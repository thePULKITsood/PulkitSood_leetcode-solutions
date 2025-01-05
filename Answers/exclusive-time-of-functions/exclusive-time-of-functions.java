class Solution {
    
   static class pair {
        int id ; 
        int start ;
        int child;
        pair (int i,int s,int c){
            this.id=i;
            this.start = s;
            this.child = c;
        }
    }
    
    public int[] exclusiveTime(int n, List<String> logs) {
        int ans [] = new int [n];
         Stack<pair> st = new Stack();
        

        for (String log : logs ){
        
            String parts[] = log.split(":");
            
            int id = Integer.parseInt(parts[0]);
            int time = Integer.parseInt(parts[2]);
            
            if (parts[1].equals("start"))
            {
                st.push(new pair(id, time , 0));
                
            }
            else 
            {
                pair temp  = st.pop();
                
                int interval = time - temp.start + 1 ;
                
                if (st.size()>0)
                st.peek().child += interval;
                
                int mytime = interval - temp.child; // subtracting my child 
                
                ans[id] +=mytime;
                
                
                
            }
            
        }
        return ans;
        
    }
}

// just subtract the children run time from the parent run time 

//  start - push on stack 
// end  pop -> calculate interval 
// then interval = interval - child

// update the child of my parent = interval + my child 

// do the  same thing for all 
