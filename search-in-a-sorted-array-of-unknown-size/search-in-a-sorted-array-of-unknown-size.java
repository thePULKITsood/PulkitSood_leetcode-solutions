/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int start = 0;
        int end = 1 ;
        while (reader.get(end)<target)
        {
            start = end;
            end = end*2;
        }
        
        while  (start <= end){
            int mid = start+ (end-start) /2;
            
            int num = reader.get(mid);
            
            if(num==target) return mid;
            if (num<target) start = mid+1;
            else end = mid-1;
            
        }
        return -1;
        
    }
}