class MyCalendarTwo {
    List<int []> calander ;
    List<int[]> overlaps;
    
    public MyCalendarTwo() {
    calander= new ArrayList();
        overlaps = new ArrayList();
        
    }
    
    public boolean book(int start, int end) {
        for (int ov []: overlaps){
            if(Math.max(start,ov[0])< Math.min(end,ov[1]))
              return false;
        }
        for (int ev []: calander){
            if(Math.max(start,ev[0])<Math.min(end,ev[1]))
            {
                //add to over lap
                int ovs = Math.max(start,ev[0]);
                int ove = Math.min(end,ev[1]);
                overlaps.add(new int [] {ovs,ove});
            }
            
        }
        calander.add(new int []{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */