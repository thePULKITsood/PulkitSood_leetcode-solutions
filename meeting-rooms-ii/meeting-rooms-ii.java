class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> rooms = new ArrayList();
        // rooms.add(intervals[0]);
                  
        for (int[] interval : intervals){
            
            boolean added = false;
            if(rooms.size()==0)
            {
                rooms.add(interval);
                continue;
            }
            for (int[]room :rooms)
            {
                if(interval[0]>=room[1]){
                    room[1]=interval[1];
                
                added=true;
                break;
                }
            }
            if(!added)
                rooms.add(interval);
        }
        return rooms.size();
        
    }
}
// first we did mergin intervals now it is the opposite we need to find the numbner fo conference rooms 
//if they dont overlap we do not need a conference room 

//first allot a conference room to the first meeting 
//then for seond check if it overlaps with the first if it does then give a new room 
//for third check with first two 


//if i sort them then my problem where some middle space is left in the meeting rooms gets over 

// it is a n2 solution 