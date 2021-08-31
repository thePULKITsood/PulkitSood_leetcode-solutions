class MyCalendar {

        List<int []> calander;
    public MyCalendar() {
        calander = new ArrayList();
    }
    
    public boolean book(int start, int end) {
        
        for (int event[] : calander){
            // if(event[0] <=start && <event[1] || event[0] < end <event[1] )
            if(event[0]<end && start <event[1]) 
            return false;
        }
        calander.add(new int []{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */