class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        for (int i=0 ; i< intervals.length-1 ; i++){
            if (intervals[i][1] > intervals[i+1][0])
                return false;
        }
        return true;
    }
}
//sort then look if any ovelappings are there with the end time of first and the start time of next 
