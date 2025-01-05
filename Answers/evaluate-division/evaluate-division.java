class Solution {
    class Node {
        String str;
        double w ;
        Node (String s, double wt){
            str = s;
            w = wt ;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        // Step 1 make a graph 
        
//         step 2 run a dfs and return the ans 
        
//         graphs - string  with List of node  
//         node = string + weight 
        
//         call the make graph function 
        HashMap <String ,List<Node> > g = makegraph(equations,values);
        
        double[] ans = new double[queries.size()];
//         now i have a graph now i need to run a dfs function for each query that will return either -1 or the value of multliplication of weights 
        
        for (int i  = 0 ; i< queries.size() ; i++){
            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);
        
            if (! ( g.containsKey(src) &&  g.containsKey(dest))) 
            {ans[i] = -1.0;
             continue;} 
            ans[i] = dfs(src, dest , g , new HashSet() );
            
            
        }
        
        return ans;
        
    }
    
    public double dfs (String src, String dest ,HashMap <String ,List<Node> > g ,HashSet<String > visited ){
        // double wt =  1.0; 
        // if (src == dest ) return wt ;
        if(src.equals(dest)) return 1.0 ;
        
        
//         mark the visited of this string true ; 
        
        visited.add(src);
        
//         nahi to i need to make a dfs call to all my neighbours 
        List<Node> nbrs = g.get(src);
        
        for (Node nbr : nbrs){
            
            if (!visited.contains(nbr.str))
                
            {
                double ans= dfs(nbr.str , dest , g ,visited  );
                if (ans != -1.0)
                   return  nbr.w *ans ;

            }
        }
       
       return -1.0;
        
    }
    
    
    public  HashMap <String ,List<Node> >  makegraph(List<List<String>> equations, double[] values)
    {
         HashMap <String ,List<Node> >g = new  HashMap ();
            for (int i =0;i<values.length ; i++)
            {
            String src= equations.get(i).get(0);
            String dest= equations.get(i).get(1);
                
            double wt = values[i];
            
//             i have to make a new array list if it is empy as i have not initialised the list till now
            g.putIfAbsent(src,new ArrayList());
            g.putIfAbsent(dest, new ArrayList());
                
            g.get(src).add(new Node(dest,wt));
            g.get(dest).add(new Node (src, 1/wt ));
        }
        return g;
    }
}