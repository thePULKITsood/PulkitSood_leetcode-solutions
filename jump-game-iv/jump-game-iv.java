class Solution {
    public int minJumps(int[] arr) {
        int n =arr.length;
        
        if(n<=1)
            return 0;
        
        Map<Integer,List<Integer>> map = new HashMap();
        
        for (int i =0;i<arr.length;i++){
        
            if(map.get(arr[i])==null)
                map.put(arr[i],new ArrayList());
            
            map.get(arr[i]).add(i);
        }
        
        Queue <Integer> q = new LinkedList();
        boolean visited[] = new boolean[n];
        q.add(0);
        int level = 0;
        visited[0]=true;
        
        while (!q.isEmpty())
        {
            int size = q.size();
            
            while (size -- > 0)
            {
            
                int temp = q.remove();
                
                if(temp == n-1)
                    return level;
                
//                 visited[temp]=true;
                
//                 if(temp+1 < n && visited[temp+1]==false){
//                     visited[temp+1]=true;
//                     q.add(temp+1);
//                 }
                
//                 if(temp-1 >=0 && visited[temp-1]==false){
//                     visited[temp-1] = true;
//                     q.add(temp-1);
//             }
                List<Integer> next = map.get(arr[temp]);
                next.add(temp-1);next.add(temp+1);
                
                for (int j :next){
                    if(j>=0 && j< n && !visited[j]){
                        visited[j]=true;
                        q.add(j);
                    }
                }
                next.clear();
               
            }
            level++;
        }
        return 0;
    }
}
// make  a hashmap to store all the same value indexes and then do a bfs add i -1 
// i-2 and all the values of the same index and mark them andjust that return the level