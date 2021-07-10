/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public int depthSumInverse(List<NestedInteger> nestedList) {
        //basicaly the depth is decreasing downwards meaning the 
//         sum of above level is used many times and the sum of last level is used only once 
//         using this observation i can add the  prev level sum in the current level and thus it will casue the effect of multliplication as many times is needed 
        
//         using bfs 
        
        LinkedList<NestedInteger> q = new LinkedList();
        q.addAll(nestedList);
        
        int prev = 0 ; 
        int total = 0 ;
        
        while (q.size()!=0){
            int size = q.size();
               int thislevel=0;
            while (size--> 0){
         
            NestedInteger n = q.removeFirst();
            
            if (n.isInteger())
                thislevel += n.getInteger();
            
            else 
                q.addAll(n.getList());
            
            }
            prev = prev + thislevel;
            total += prev ;
            
//             here the sum is maintained in prev and it is where all the magic happenes at every time the full prev is added int he total which makes the total having the effect of multliplication
            
        }
        
        return total;
        
    }
}
 // weight of an integer is maxDepth - (the depth of the integer) + 1
// ican do it using the first algorithm or i can make a new algo for it 
