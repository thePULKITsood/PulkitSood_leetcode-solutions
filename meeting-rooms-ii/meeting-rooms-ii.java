class Solution {
    public int minMeetingRooms(int[][] intervals) {
        //on the peak of priority q we have minimum ending time 
        //thats all we need and not ot traverse and search all the elements 
        
        
        Arrays.sort (intervals, (a,b)-> Integer.compare(a[0],b[0]));
        
        PriorityQueue <Integer> pq = new PriorityQueue();
//         as we are going to store only the ending time of each meeting 
        int max = 0;
        for (int [] interval: intervals){
            
            if (pq.size()==0){
                pq.add(interval[1]);
            }else{
                if (pq.peek()>interval[0])
                    pq.add(interval[1]);
                else{
                    pq.remove();
                        pq.add(interval[1]);
                }
            }
            max = Math.max(max,pq.size());
        }
        return max;
    }
}
// 1. sort 
// 2. to find a new room i was using n2 method meaning comparing each room with the prev all roms 
// 3. this time i will compare it with the smallest and only see that if it fits it or not 
