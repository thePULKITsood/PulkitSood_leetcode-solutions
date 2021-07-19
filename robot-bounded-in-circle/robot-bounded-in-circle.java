class Solution {
    public boolean isRobotBounded(String ist) {
        int x= 0;
        int y =0;
        int dir = 0;
        
        int [][] moves = {{0,1},{1,0},{0,-1},{-1,0}}; // n , e , s , w
        for (char c : ist.toCharArray()){
            switch(c){
                    case'G':
                    x += moves[dir][0];
                    y += moves[dir][1];
                    break;
                    
                case 'L':
                    dir = (dir+3)%4;
                    break;
                    
                    
                case 'R':
                    dir = (dir+1)%4;
                    break;
                   
            }
            
        }
        return( x==0 && y==0 || dir !=0) ;
    }
}


// if end == start then we are in a circle 
// if the direction changes at the end from north to something else we will eventually return to north 
// so we must only check two things 

// if after the entire operation - we are at the origin then return true 
// if after all the stuff if our direction is anythign other than north then return true 
