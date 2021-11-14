class CombinationIterator {

    PriorityQueue<String> pq = new PriorityQueue();
    
    
    public CombinationIterator(String characters, int combinationLength) {
        generate(characters,combinationLength,0,new StringBuilder());
        
        
    }
  void  generate(String input, int len , int start , StringBuilder sb){
        if(len==0){
            pq.add(sb.toString());
            return;
        }
        for (int i=start;i<=input.length() -len ;i++){
            
            sb.append(input.charAt(i));
            generate(input,len-1,i+1,sb);
            sb.deleteCharAt(sb.length()-1);
        
        }
    }
    
    public String next() {
    
        if(hasNext())
            return pq.poll();
        else
            return null;
    }
    
    public boolean hasNext() {
        return (pq.size()>0);
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */