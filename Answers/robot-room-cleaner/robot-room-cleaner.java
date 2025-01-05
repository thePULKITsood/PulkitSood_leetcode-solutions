/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 
 *     public void clean();
 * }
 */

class Solution {
      private final int[][] dirs= {{-1,0},{0,-1},{1,0},{0,1}};
      private Set<String> visited = new HashSet<>();
    
    public void cleanRoom(Robot robot) {
        dfs(robot,0,0,0 );
        
        
    }
    public void dfs ( Robot robot , int i , int j , int dir ){
        
    if (visited.contains(i+","+j))
        return;
        
//         now work is to be done 
        robot.clean();
        visited.add(i+","+j);
        
//         now making the calls 
        for (int k = 0; k < 4; ++k){
            
            if(robot.move()){
                 //if the robot can move(meaning there's no physical obstacle)
                dfs(robot, i +dirs[dir][0], j + dirs[dir][1] , dir);
                
//                 now we have move the robot now its time to backtrack
                robot.turnRight();
                robot.turnRight();
                robot.move();
                robot.turnRight();
                robot.turnRight();
                
//                 change directoin and move 
            }
            
            robot.turnRight();
            dir = (dir +1 ) % 4 ;
        }
        
    }
}