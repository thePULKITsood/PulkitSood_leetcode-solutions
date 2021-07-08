/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */
//    a b c 
// a [1,1,0],
// b [0,1,0],
// c [1,1,1],

// graph[i][j] = 1 means person i knows person j, otherwise graph[i][j] = 0 means person i does not know person j. 

public class Solution extends Relation {
    
    public int findCelebrity(int n) {
        
        Stack <Integer> st = new Stack();
        
        st.push(0);
        for (int i = 1 ; i <n ; i++ ){
            int a= st.pop();
            int b = i;
            
            if (knows (a,b)) 
            {
                st.push(b);
                continue;}
            else {
                st.push(a);
            }
            
        }
        if (st.size ()==0)
            return 0;
        
        else {
            //check if actually we have a celeb 
            
            int index = st.pop();
            
            for (int i =0 ; i<n ; i++){
                if (i==index) continue;
                if (knows(index , i ) == false && knows (i ,index ) == true)
                    continue;
                return -1;
            }
            return index;
        }
        
        
        
    }
}

// all know the celebrity but celebrity dosnt know any one 

// basically --> i will use stack 

// if (a knows b )
//     a is not the celebrity as   a celeb do not know anybody 
    
//     if a does not know b b is not a celeb as   everybody knows celeb 
    