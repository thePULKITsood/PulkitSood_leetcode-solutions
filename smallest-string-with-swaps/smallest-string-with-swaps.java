class Solution {
    int par[];
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        par = new int [n];
        
        for (int i=0;i<n;i++)par[i]=i;
        for (List<Integer> l : pairs){
            int pa = find(l.get(0));
            int pb = find (l.get(1));
            if(pa!=pb){
              
                    par[pa]=pb;
               
            }
        }
        
        
        char[] ans = new char [n];
        Map<Integer, List<Integer>> map = new HashMap();
        for (int i=0;i<n;i++){
            int p=find(i);
            
            if(!map.containsKey(p))
                map.put(p,new ArrayList<Integer>());
            
            map.get(p).add(i);
        }
        for (List<Integer> l : map.values()){
            char [] mini = new char [l.size()];
            int j=0;
            for (int i:l){
                mini[j++]=s.charAt(i);
            }
            Arrays.sort(mini);
            Collections.sort(l);
            j=0;
            for (int i:l){
                ans[i]=mini[j++];
            }
        }
        return new String(ans);
     }
    int find (int a){
        if(par[a]==a)return a;
        return par[a]=find(par[a]);
    }
}