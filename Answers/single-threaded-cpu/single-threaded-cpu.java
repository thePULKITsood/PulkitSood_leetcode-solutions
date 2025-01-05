class Solution {
    class task {
        int index,et,pt;
        task(int i ,int et ,int pt){
            this.index=i;
            this.et=et;
            this.pt=pt;
        }
    }
    public int[] getOrder(int[][] tasks) {
        PriorityQueue<task> globalq = new PriorityQueue<> ( (x,y )-> x.et - y.et);
        PriorityQueue<task> processingq = new PriorityQueue<> ( (x,y )-> x.pt == y.pt ? x.index-y.index : x.pt-y.pt );
        
        int []result = new int [tasks.length];
        
        for (int i=0;i<tasks.length;i++) globalq.offer(new task(i,tasks[i][0] ,tasks[i][1]));
        
        int index = 0;
        int time = globalq.peek().et;
        
        while (!globalq.isEmpty() || !processingq.isEmpty()){
            
            while (!globalq.isEmpty() && globalq.peek().et <=time)
                processingq.offer(globalq.poll());
            
            if (!processingq.isEmpty()){
                
                    time = time + processingq.peek().pt;
                result[index++] = processingq.poll().index;
                
                }
            else
                    time = globalq.peek().et;
            
            
        }
        return result;
        
    }
}

//  a global variable time 
// the tasks before or till this time are available to be selected 

// selection critereia -> processing time least 
// if same then smallest index meaning the first jo aaea 

// stor the tasks in a global heap based on the criteria of enque time 

// then make another heap based on the processing time and that heap will be from where get the values to process 

