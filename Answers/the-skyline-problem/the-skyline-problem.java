class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
       
        List<List<Integer>> ans = new ArrayList();
        List<int []> height = new ArrayList();
        
        //now filling the height array -> starting height will be marked begative 
        //ending point will be marked positive
        
        for (int []b: buildings){
             // start point has negative height value
             height.add(new int[]{b[0], -b[2]});
            
            // end point has normal height value
             height.add(new int[]{b[1], b[2]}); 
        }
        
        
        //now sort this based on the statring points and if the points are the same sort on the basis of more height ! 
         // sort $height, based on the first value, if necessary, use the second to break ties
        
        //if xcordinates are same then sort on increasing order of height 
        // -> here we will be able to use the -ve height funda 
        
        Collections.sort(height,(a,b)-> {
            if(a[0]==b[0])
                return a[1]-b[1];
            
            return a[0] - b[0];
        });
        
        // Use a maxHeap to store possible heights
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> (b-a));
    
            pq.add(0);
        
        int cht=0;
        
        for (int h[]:height){
            if(h[1]<0){
                //starting point add it to the pq
                // add it to active rectangle 
                pq.add(-h[1]);
            }
            else {
                //ending point -> remove it from pq
                //one active point is getting out ! 
                pq.remove(h[1]);   //O(N) -> complexity 
            }
            
            
            if(cht != pq.peek()){
                // meaning jo height the curent chal rahi abb wo remove ho chuki hai form the proority queue
                // or we have added a more bigger height in both the cases we will update our answer
                
                ArrayList<Integer> mini = new ArrayList();
                
                mini.add(h[0]);
                mini.add(pq.peek());
                
                ans.add(mini);
                
                cht=pq.peek();
            }
            
        }
        return ans;
    
    
    }
}