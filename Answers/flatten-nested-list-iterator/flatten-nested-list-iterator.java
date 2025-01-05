/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    ArrayList<Integer> ans = new ArrayList();
    
    private int i=0;
    private int size ;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        // impliment a basic dfs then we are done 
        size = 0;
        dfs(nestedList);
        size = ans.size();
        
    }
   void dfs(List<NestedInteger> nl){
        for (NestedInteger n : nl){
            if (n.isInteger())
                ans.add(n.getInteger());
            
            else 
                dfs(n.getList());
        }
        
    }

    @Override
    public Integer next() {
        return ans.get(i++);
        
    }

    @Override
    public boolean hasNext() {
        
        if(i<size)
            return true;
        
        return false;
        
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */