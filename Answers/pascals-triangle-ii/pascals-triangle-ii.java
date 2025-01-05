class Solution {
    public List<Integer> getRow(int r) {
        
        List<Integer> prev = new ArrayList();
        prev.add(1);
        
            for ( int i = 1 ; i <= r ; i++ ){
            List<Integer> mini = new ArrayList();
            
            mini.add(1);
            for (int j = 1 ;j < i ; j++ ){
                
                mini.add(prev.get(j-1) + prev.get(j));
                
            }
            mini.add(1);
            prev = mini;    
            
            
            
        }
        return prev;
    }
}