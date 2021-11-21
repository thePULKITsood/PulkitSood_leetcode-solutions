class Solution {
   
    public int numBusesToDestination(int[][] routes, int source, int target) {
   
        if(source == target )return 0;
        
        // bus number and bus stop number 
        // bus number is the routes[i]
        // bus stop number is routes[i][j];
        
        // creating a graph where the busses are connected 
        // to connect busses both the busses must have atleast one same stops 
        
        int num_buses = routes.length;
        
        List<Integer>[] bus_graph = new ArrayList [num_buses];
        
        for (int i=0 ; i<num_buses ; i++){
            
            bus_graph[i] = new ArrayList();
            Arrays.sort(routes[i]);
            
        }
        
        // now making a graph it is a process of n *n (n=num of buses )
        // as i have to check if each bus intersects with each other bus 
        
        for (int i=0;i<num_buses;i++){
            for (int j=i+1;j<num_buses;j++){
                
                if(intersect (i,j,routes)){
                    
                    bus_graph[i].add(j);
                    bus_graph[j].add(i);
                }
            }
        }
        
        // i need to make a bfs search from all the sources to all the targets and return the minimum number of buses 
        // to store all the starting and ending buses i will use hash sets to make it easy 
        
 
        HashSet<Integer> targets = new HashSet();
        HashSet<Integer> seen = new HashSet();
        Queue<Integer> q = new LinkedList();
        
        for (int i =0;i<num_buses;i++){
            if(Arrays.binarySearch(routes[i],source)>=0)
            {
                seen.add(i);
                q.add(i);
            }
            if(Arrays.binarySearch(routes[i],target)>=0)
                targets.add(i);
        }
        
        int level=1;
        while (q.size()>0){
            int size = q.size();
            while (size-->0){
                int rem = q.remove();
                if(targets.contains(rem))return level;
                
                // add all the buses i can go from this bus 
                for (int buses : bus_graph[rem]){
                    if(!seen.contains(buses))
                    {
                        q.add(buses);
                        seen.add(buses);
                    }
                }
            }
            level++;
        }
        return -1;
    }
    
    public boolean intersect (int i , int j , int routes[][]){
        int a = 0; // pointer to bus i in routes 
        int b = 0; // pointer to bus j in routes 
        
        while (a<routes[i].length && b< routes[j].length){
        
            if(routes[i][a] == routes[j][b]) return true;
            if(routes[i][a] < routes[j][b]) a++ ; else b++;
            
        }
        return false;
    }
}