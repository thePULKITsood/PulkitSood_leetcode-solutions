class Solution {
    class pair {
        int count ;
        char ch;
        pair (int c, char ch){
            this.count=c;
            this.ch=ch;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        PriorityQueue<pair> pq = new PriorityQueue<>((x,y)->y.count-x.count);
        
        if (a > 0)
			pq.add(new pair(a,'a'));
		if (b > 0)
			pq.add(new pair( b,'b'));
		if (c > 0)
			pq.add(new pair( c,'c'));
        
        while (pq.size()>1){
            pair first = pq.remove();
            pair second = pq.remove();
            
            if(first.count>=2)
            {   sb.append(first.ch);
                sb.append(first.ch);
                first.count-=2;
            }
            else {
                sb.append(first.ch);
                first.count-=1;
            }
            if(second.count>=2 && second.count >= first.count){
                sb.append(second.ch);
                sb.append(second.ch);
                second.count-=2;
            }
            else {
                sb.append(second.ch);
                second.count-=1;
            }
            
            if(first.count>0)
                pq.add(first);
            
            
            if(second.count>0)
                pq.add(second);
            
        }
        if(pq.isEmpty())
        return sb.toString();
        
        if(pq.peek().count>=2){
             sb.append(pq.peek().ch);
        sb.append(pq.peek().ch);
        }
        else {
                sb.append(pq.peek().ch);
              
        }
        return sb.toString();
    }
}