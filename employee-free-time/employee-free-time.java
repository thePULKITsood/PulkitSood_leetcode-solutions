/*
// Definition for an Interval.
class Interval {
    public int start;
    public int end;

    public Interval() {}

    public Interval(int _start, int _end) {
        start = _start;
        end = _end;
    }
};
*/

class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        PriorityQueue<Interval> heap = new PriorityQueue<>((a,b)->a.start - b.start );
        
        for (List<Interval> emp : schedule){
            for (Interval i : emp){
                heap.add(i);
            }
        }
        
        List<Interval> ans = new ArrayList();
        
        Interval prev = heap.remove();
        while (!heap.isEmpty()){
            
            if(prev.end<heap.peek().start){
                ans.add(new Interval(prev.end,heap.peek().start));
                prev = heap.remove();
            }
            else 
             prev.end = Math.max(prev.end,heap.remove().end);
            
            }
        return ans;
        }
}
        
    
